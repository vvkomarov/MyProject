package level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOutputStream1 = new FileOutputStream(reader.readLine());
        FileInputStream fileInputStream2 = new FileInputStream(reader.readLine());
        FileInputStream fileInputStream3 = new FileInputStream(reader.readLine());
        reader.close();
        while (fileInputStream2.available() > 0) {
            int k = fileInputStream2.read();
            fileOutputStream1.write(k);
        }
        fileInputStream2.close();
        while (fileInputStream3.available() > 0) {
            int k = fileInputStream3.read();
            fileOutputStream1.write(k);
        }
        fileInputStream2.close();
        fileOutputStream1.close();
    }
}