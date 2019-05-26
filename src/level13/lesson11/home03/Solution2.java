package level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть закрыть файл и поток.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution2 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String read = "C:\\Users\\Admin\\IdeaProjects\\MyProject\\src\\level13\\lesson11\\home03\\text.txt";
        InputStream inputStreamReader = new FileInputStream(read);
        while (inputStreamReader.available() > 0) {
            int data = inputStreamReader.read();
            System.out.println((char) data);
        }
        inputStreamReader.close();
    }

}