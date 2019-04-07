package level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        reader.close();
        FileInputStream file3 = new FileInputStream(filename1);
        FileInputStream file2 = new FileInputStream(filename2);
        byte[] q = new byte[file3.available()];
        file3.read(q);
        byte[] b = new byte[file2.available()];
        file2.read(b);
        FileOutputStream file1 = new FileOutputStream(filename1);
        file1.write(b, 0, b.length);
        file1.write(q);
        file1.close();
        file2.close();
        file3.close();
    }

}
