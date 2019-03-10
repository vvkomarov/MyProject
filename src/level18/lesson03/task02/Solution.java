package level18.lesson03.task02;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int maxbyte = inputStream.read();
        while (inputStream.available() > 0) {
            int read = inputStream.read();
            if (read < maxbyte) maxbyte = read;
        }
        reader.close();
        inputStream.close();
        System.out.println(maxbyte);
    }
}