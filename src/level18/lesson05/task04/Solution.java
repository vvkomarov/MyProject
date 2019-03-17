package level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());
        reader.close();
        byte[] buffer = new byte[fileInputStream.available()];
        int k = fileInputStream.read(buffer, 0, fileInputStream.available());
        fileInputStream.close();
        for (int j = buffer.length; j > 0; j--) {
            fileOutputStream.write(buffer[j - 1]);
        }
        fileOutputStream.close();
    }
}