package level10.lesson11.home09;

/* Одинаковые слова в списке

Ввести с клавиатуры в список 20 слов. Нужно подсчитать количество одинаковых слов в списке.

Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,

а второй – число, сколько раз данная строка встречалась в списке.

Вывести содержимое словаря на экран.

В тестах регистр (большая/маленькая буква) не влияет на результат.

*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = addMap();
        printMap(map);
    }

    public static HashMap<String, Integer> addMap() throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        map.put(reader.readLine(), 1);
        for (int j = 0; j < 19; j++) {
            boolean check = false;
            String s = reader.readLine();
            for (Map.Entry<String, Integer> r : map.entrySet()) {
                if (r.getKey().toLowerCase().equals(s.toLowerCase())) {
                    r.setValue(r.getValue() + 1);
                    check = true;
                }
            }
            if (check != true) {
                map.put(s, 1);
            }
        }
        return map;
    }

    public static void printMap(HashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}