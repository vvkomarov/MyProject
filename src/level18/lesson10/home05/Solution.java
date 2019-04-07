package level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
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
        FileInputStream file1 = new FileInputStream(filename1);
        FileOutputStream file2 = new FileOutputStream(filename2);
        byte[] c = new byte[file1.available()];
        file1.read(c);
        String s = "";
        for (int j = 0; j < c.length; j++) {
            if ((c[j] != (byte) ' ') && (j != c.length - 1)) {
                char r = (char) Integer.parseInt(String.valueOf(c[j]));
                s = s + r;
            } else {
                double a = Double.parseDouble(s);
                file2.write(((int) Math.round(a) + " ").getBytes());
                s = "";
            }
        }
        file1.close();
        file2.close();
    }

}
