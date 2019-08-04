package level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом
Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources
Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1
Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
        Map<String, Double> map = new TreeMap<>();
        String str;
        while ((str = reader.readLine()) != null) {
            String[] result = str.split(" ");
            String name = result[0].replaceAll("([^А-Я а-я])", "");
            Double value = Double.parseDouble(result[1]);
            if (map.containsKey(name)) {
                Double newValue = value + map.get(name);
                map.replace(name, newValue);
            } else {
                map.put(name, value);
            }
        }
        for (Map.Entry<String, Double> k : map.entrySet()) {
            System.out.println(k.getKey() + " " + k.getValue());
        }
    }
}
