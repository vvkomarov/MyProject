package level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\MyProject\\src\\level18\\lesson05\\task03\\file1.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\MyProject\\src\\level18\\lesson05\\task03\\file2.txt");
        FileOutputStream fileOutputStream1 = new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\MyProject\\src\\level18\\lesson05\\task03\\file3.txt");
        reader.close();
        while (fileInputStream.available() > 0) {
            byte[] buffer = new byte[fileInputStream.available()];
            int count = fileInputStream.read(buffer);
            if (count % 2 == 0) {
                fileOutputStream.write(buffer, 0, count / 2);
                fileOutputStream1.write(buffer, count / 2, count / 2);
            } else {
                fileOutputStream.write(buffer, 0, count / 2);
                fileOutputStream1.write(buffer, count / 2, count / 2 + 1);
            }
        }
        fileInputStream.close();
        fileOutputStream.close();
        fileOutputStream1.close();
    }

}
