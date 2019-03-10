package level18.lesson03.task01;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int maxbyte = 0;
        while (inputStream.available() > 0) {
            int read = inputStream.read();
            if (read > maxbyte) maxbyte = read;
        }
        reader.close();
        inputStream.close();
        System.out.println(maxbyte);
    }
}