package level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран частоту встречания пробела. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        double count = 0;
        double length = fileInputStream.available();
        while (fileInputStream.available() > 0) {
            if (fileInputStream.read() == (byte) ' ') {
                count++;
            }
        }
        double result = (count / length) * 100;
        fileInputStream.close();
        System.out.println(Math.round(result * 100.0) / 100.0);
    }
}