package level08.lesson03.task03;

/* Коллекция HashMap из котов

Есть класс Cat с полем имя (name, String).

Создать коллекцию HashMap<String, Cat>.

Добавить в коллекцию 5 котов, в качестве ключа использовать имя кота.

Вывести результат на экран, каждый элемент с новой строки.

*/

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Map<String, Cat> map = new HashMap<>();
        Cat cat1 = new Cat("Борька");
        map.put(cat1.name, cat1);
        Cat cat2 = new Cat("Васька");
        map.put(cat2.name, cat2);
        Cat cat3 = new Cat("Котик");
        map.put(cat3.name, cat3);
        Cat cat4 = new Cat("КотЭ");
        map.put(cat4.name, cat4);
        Cat cat5 = new Cat("Вася");
        map.put(cat5.name, cat5);
        for (Map.Entry<String, Cat> b : map.entrySet()) {
            System.out.println(b.getKey() + " " + b.getValue());
        }
    }

    static class Cat {
        final String name;

        Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }

}