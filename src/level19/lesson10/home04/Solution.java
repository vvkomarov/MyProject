package level19.lesson10.home04;

/* Ищем нужные строки
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words
Закрыть потоки. Не использовать try-with-resources
Пример: words содержит слова А, Б, В
Строки:
В Б А Д  //3 слова из words, не подходит
Д А Д    //1 слово из words, не подходит
Д А Б Д  //2 слова - подходит, выводим
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
        String str = "";
        while ((str = reader.readLine()) != null) {
            String[] result = str.split(" ");
            int count = 0;
            for (int j = 0; j < result.length; j++) {
                for (int k = 0; k < words.size(); k++) {
                    if (result[j].replaceAll("([^А-Я а-я A-Z a-z])", "").equals(words.get(k))) {
                        count++;
                    }
                }
            }
            if (count == 2) {
                System.out.println(str);
            }
        }
        reader.close();
    }
}
