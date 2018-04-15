package level09.lesson11.bonus02;

/* Нужно добавить в программу новую функциональность

Задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.

Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.

Если файла (который нужно копировать) с указанным именем не существует, то

программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли, а уже потом считывать файл для записи.

*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean fileexists = false;

        while (fileexists == false) {
            String sourceFileName = reader.readLine();
            File file = new File(sourceFileName);

            if (file.exists()) {
                System.out.println("Укажите место для копирования файла");
                String destinationFileName = reader.readLine();
                FileInputStream fileInputStream = new FileInputStream(sourceFileName);
                FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);

                int count = 0;
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read());
                    count++;
                }

                System.out.println("Скопированно " + count + " байт");
                fileInputStream.close();
                fileOutputStream.close();
                fileexists = true;
            } else {
                System.out.println("Файл не существует");
                System.out.println("Укажите имя файла: ");
            }
        }
    }
}
