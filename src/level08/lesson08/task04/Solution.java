package level08.lesson08.task04;

/* Удалить всех людей, родившихся летом

Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».

Удалить из словаря всех людей, родившихся летом.

*/

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        HashMap<String, Date> map = new HashMap<>();
        addMap(map);
        removeSummer(map);
        for (Map.Entry<String, Date> b : map.entrySet()) {
            System.out.println(b.getKey());
        }
    }

    public static Map addMap(HashMap<String, Date> map) {
        map.put("Петров", new Date(1992, 10, 3));
        map.put("Иванов", new Date(1993, 11, 3));
        map.put("Сидоров", new Date(1992, 6, 3));
        map.put("Смирнов", new Date(1992, 07, 3));
        map.put("Сидорнеко", new Date(1992, 8, 6));
        map.put("Паргубко", new Date(1980, 1, 1));
        map.put("Николаев", new Date(1980, 10, 25));
        map.put("Паргубняк", new Date(1998, 5, 3));
        map.put("Падрубняк", new Date(1990, 10, 30));
        map.put("Верняк", new Date(1900, 2, 3));
        return map;
    }

    public static HashMap<String, Date> removeSummer(HashMap<String, Date> map) {
        ArrayList<String> key = new ArrayList<>();
        for (Map.Entry<String, Date> b : map.entrySet()) {
            if (b.getValue().getMonth() == 6 || b.getValue().getMonth() == 7 || b.getValue().getMonth() == 8) {
                key.add(b.getKey());
            }
        }
        for (String b : key) {
            map.remove(b);
        }

        return map;
    }
}