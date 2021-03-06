package level08.lesson03.task05;

/* Вывести на экран список значений

Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.

Вывести на экран список значений, каждый элемент с новой строки.

*/


import java.util.HashMap;
import java.util.Map;

class Solution {


    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("Sim", "Sim");

        map.put("Tom", "Tom");

        map.put("Arbus", "Arbus");

        map.put("Baby", "Baby");

        map.put("Cat", "Cat");

        map.put("Dog", "Dog");

        map.put("Eat", "Eat");

        map.put("Food", "Food");

        map.put("Gevey", "Gevey");

        map.put("Hugs", "Hugs");

        printValues(map);

    }

    public static void printKeys(Map<String, String> b) {
        for (Map.Entry<String, String> k : b.entrySet()) {
            String key = k.getKey();
            System.out.println(key);
        }
    }

    public static void printValues(Map<String, String> b) {
        for (Map.Entry<String, String> k : b.entrySet()) {
            String value = k.getValue();
            System.out.println(value);
        }
    }
}