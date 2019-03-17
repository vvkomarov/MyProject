package level18.lesson05.task02;

/* Подсчет запятых
        С консоли считать имя файла
        Посчитать в файле количество символов ',', количество вывести на консоль
        Закрыть потоки. Не использовать try-with-resources
        Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        reader.close();
        int count = 0;
        while (fileInputStream.available() > 0) {
            if (fileInputStream.read() == (byte) ',') {
                count++;
            }
        }
        fileInputStream.close();
        System.out.println(count);
    }

}