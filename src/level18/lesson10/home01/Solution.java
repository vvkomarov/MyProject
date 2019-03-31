package level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0].toString());
        int count = 0;
        while (fileInputStream.available() > 0) {
            int j = fileInputStream.read();
            if ((j >= 65 & j <= 90) || (j >= 97 & j <= 122)) {
                count++;
            }
        }
        fileInputStream.close();
        System.out.println(count);
    }
}
