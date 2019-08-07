package level19.lesson10.home03;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами
Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources
Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
        String str;
        while ((str = reader.readLine()) != null) {
            String[] result = str.split(" ");
            String name = result[0];
            Calendar calendar = new GregorianCalendar();
            for (int j = 1; j < result.length; j++) {
                try {
                    int day = Integer.parseInt(result[j]);
                    int mounth = Integer.parseInt(result[j + 1]);
                    int year = Integer.parseInt(result[j + 2]);
                    calendar.set(year, mounth, day);
                    break;
                } catch (Exception e) {
                    name += " " + result[j];
                }
            }
            DateFormat format = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            Date birthday = calendar.getTime();
            Person person = setPerson(name, birthday);
            PEOPLE.add(person);
        }
        reader.close();
        getPeople();
    }

    public static Person setPerson(String name, Date birthday) {
        return new Person(name, birthday);
    }

    public static void getPeople() {
        for (Person person : PEOPLE) {
            System.out.println(person.getName() + " " + person.getBirthday());
        }
    }
}
