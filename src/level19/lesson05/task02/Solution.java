package level19.lesson05.task02;
/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader1 = new FileReader(reader.readLine());
        int world = 0;
        String result = "";
        while (reader1.ready()) {
            result += ((char) (reader1.read()));
        }
        String[] allWord = result.split("\\W");
        for (int j = 0; j < allWord.length; j++) {
            if (allWord[j].equals("world")) {
                world++;
            }
        }
        System.out.println(world);
        reader.close();
        reader1.close();
    }
}
