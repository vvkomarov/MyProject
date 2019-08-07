package level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом
Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources
Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85
Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception {
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
        Double max = Collections.max(map.values());
        for (Map.Entry<String, Double> k : map.entrySet()) {
            if (max.equals(k.getValue()))
                System.out.println(k.getKey());
        }
        reader.close();
    }
}
