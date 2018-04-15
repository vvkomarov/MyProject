package level09.lesson11.bonus02;
/* Нужно добавить в программу новую функциональность

Задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.

Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.

Если файла (который нужно копировать) с указанным именем не существует, то

программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли, а уже потом считывать файл для записи.

*/

import java.io.*;

public class Solution2 {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(reader.readLine());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            fileInputStream = new FileInputStream(reader.readLine());
        }

        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());

        while (fileInputStream.available() > 0) {
            fileOutputStream.write(fileInputStream.read());
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}