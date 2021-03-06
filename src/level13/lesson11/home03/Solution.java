package level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть закрыть файл и поток.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader read = new BufferedReader(new FileReader(reader.readLine()));
            String result;
            while ((result = read.readLine()) != null) {
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}