package level08.lesson03.task06;

/* Коллекция HashMap из Object

Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.

Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):

Sim - 5

*/


import java.util.HashMap;
import java.util.Map;

class Solution {


    public static void main(String[] args) {

        HashMap<String, Object> map = new HashMap<>();

        map.put("Sim", 5);

        map.put("Tom", 5.5);

        map.put("Arbus", false);

        map.put("Baby", null);

        map.put("Cat", "Cat");

        map.put("Eat", (long) 56);

        map.put("Food", '3');

        map.put("Gevey", '6');

        map.put("Hugs", 111111111111L);

        printMap(map);

    }

    public static void printMap(Map<String, Object> b) {
        for (Map.Entry<String, Object> z : b.entrySet()) {
            System.out.println(z.getKey() + " - " + z.getValue());
        }
    }
}