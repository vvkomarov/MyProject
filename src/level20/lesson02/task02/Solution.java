package level20.lesson02.task02;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush
В файле your_file_name.tmp может быть несколько объектов JavaRush
Метод main реализован только для вас и не участвует в тестировании
*/

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);
            System.out.println(your_file_name.getAbsolutePath());

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.users.add(new User());
            javaRush.users.get(0).setFirstName("Tom");
            javaRush.users.get(0).setLastName("Anderson");
            javaRush.users.get(0).setCountry(User.Country.RUSSIA);
            javaRush.users.get(0).setBirthDate(new Date(1508944516163L));
            javaRush.users.get(0).setMale(true);
            javaRush.users.add(new User());
            javaRush.users.get(1).setFirstName("Anna");
            javaRush.users.get(1).setLastName("Anderson");
            javaRush.users.get(1).setCountry(User.Country.OTHER);
            javaRush.users.get(1).setBirthDate(new Date(1508944516163L));
            javaRush.users.get(1).setMale(false);
            javaRush.users.add(new User());
            javaRush.users.get(2).setFirstName("Elena");
            javaRush.users.get(2).setLastName("Anderson");
            javaRush.users.get(2).setCountry(User.Country.OTHER);
            javaRush.users.get(2).setBirthDate(new Date(1508944516169L));
            javaRush.users.get(2).setMale(false);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны
            if (loadedObject.equals(javaRush)) {
                System.out.println("equals");
            }
            System.out.println(loadedObject.users.size());
            for (User u : loadedObject.users) {
                System.out.println(u.getFirstName());
                System.out.println(u.getLastName());
                System.out.println(u.getCountry());
                System.out.println(u.getBirthDate());
                System.out.println(u.isMale());
            }

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            try {
                for (User u : users) {
                    writer.println(u.getFirstName());
                    writer.println(u.getLastName());
                    writer.println(u.getCountry());
                    writer.println(u.getBirthDate().getTime());
                    writer.println(u.isMale());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            writer.close();
        }

        public void load(InputStream inputStream) {
            //implement this method - реализуйте этот метод
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                while (reader.ready()) {
                    User user = new User();
                    user.setFirstName(reader.readLine());
                    user.setLastName(reader.readLine());
                    user.setCountry(User.Country.valueOf(reader.readLine()));
                    Date date = new Date();
                    date.setTime(Long.parseLong(reader.readLine()));
                    user.setBirthDate(date);
                    user.setMale(Boolean.parseBoolean(reader.readLine()));
                    users.add(user);
                }
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
