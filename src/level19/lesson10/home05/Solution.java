package level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит слова, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
        FileWriter fileWriter = new FileWriter(args[1]);
        String str = "";
        while ((str = reader.readLine()) != null) {
            String[] result = str.split(" ");
            Pattern pattern = Pattern.compile("[.*\\d.*]");
            for (int j = 0; j < result.length; j++) {
                Matcher matcher = pattern.matcher(result[j]);
                while (matcher.find()) {
                    fileWriter.write(result[j] + " ");
                    break;
                }
            }
        }
        reader.close();
        fileWriter.close();
    }
}
