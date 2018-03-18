package level08.lesson08.task05;

/* Удалить людей, имеющих одинаковые имена

Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».

Удалить людей, имеющих одинаковые имена.

*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        addMap(map);
        deleteDublicate(map);
        print(map);
    }

    public static HashMap addMap(HashMap<String, String> map) {
        map.put("Петров", "Пётр");
        map.put("Семонов", "Семён");
        map.put("Иванов", "Иван");
        map.put("Сидоров", "Сидр");
        map.put("Сидоровян", "Пётр");
        map.put("Геннадьев", "Геннадий");
        map.put("Киррилов", "Киррил");
        map.put("Носков", "Иван");
        map.put("Буре", "Павел");
        map.put("Ковалев", "Николай");
        return map;
    }

    public static HashMap deleteDublicate(HashMap<String, String> map) {
        ArrayList<String> keys = new ArrayList<>();
        ArrayList<String> values = new ArrayList<>();
        int count = 0;
        for (Map.Entry<String, String> b : map.entrySet()) {
            values.add(b.getValue());
        }
        for (int j = 0; j < values.size(); j++) {
            for (int k = j + 1; k < values.size(); ) {
                while (true) {
                    if (values.get(j).equals(values.get(k))) {
                        k = values.size();
                        break;
                    } else if (k == values.size() - 1) {
                        values.remove(j);
                        j--;
                        k = values.size();
                        break;
                    } else {
                        k++;
                        break;
                    }
                }
            }
        }

        for (int j = 0; j < values.size(); j++) {
            for (Map.Entry<String, String> b : map.entrySet()) {
                if (values.get(j).equals(b.getValue())) {
                    keys.add(b.getKey());
                }
            }
        }

        for (int j = 0; j < keys.size(); j++) {
            map.remove(keys.get(j));
        }

        return map;

    }

    public static void print(HashMap<String, String> map) {

        for (Map.Entry<String, String> b : map.entrySet()) {
            System.out.println(b.getKey() + " " + b.getValue());
        }

    }

}