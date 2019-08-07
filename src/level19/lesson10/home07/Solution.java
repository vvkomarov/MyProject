package level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources
Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
        FileWriter fileWriter = new FileWriter(args[1]);
        String str = "";
        String writer = "";
        while ((str = reader.readLine()) != null) {
            String[] result = str.split(" ");
            for (int j = 0; j < result.length; j++) {
                if (result[j].length() > 6) {
                    writer += result[j] + ",";
                }
            }
        }
        fileWriter.write(writer.substring(0, writer.length() - 1));
        reader.close();
        fileWriter.close();
    }
}
