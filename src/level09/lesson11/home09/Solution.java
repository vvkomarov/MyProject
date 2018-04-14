package level09.lesson11.home09;

/* Десять котов

Создать класс кот – Cat, с полем «имя» (String).

Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».

Получить из Map множество(Set) всех имен и вывести его на экран.

*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        HashMap<String, Cat> map = new HashMap<>();
        addCat(map);
        Set<String> name = convert(map);
        printCat(name);
        Set<Cat> cats = convertCat(map);
        alterPrint(cats);
    }

    public static class Cat {
        String name;

        public String getName() {
            return name;
        }

        public Cat(String name) {
            this.name = name;
        }
    }

    public static HashMap<String, Cat> addCat(HashMap<String, Cat> map) {
        Cat cat1 = new Cat("Барсик");
        map.put(cat1.name, cat1);
        Cat cat2 = new Cat("Варсик");
        map.put(cat2.name, cat2);
        Cat cat3 = new Cat("Гарсик");
        map.put(cat3.name, cat3);
        Cat cat4 = new Cat("Парсик");
        map.put(cat4.name, cat4);
        Cat cat5 = new Cat("Карсик");
        map.put(cat5.name, cat5);
        Cat cat6 = new Cat("Нарсик");
        map.put(cat6.name, cat6);
        Cat cat7 = new Cat("Шарсик");
        map.put(cat7.name, cat7);
        Cat cat8 = new Cat("Щарсик");
        map.put(cat8.name, cat8);
        Cat cat9 = new Cat("Зарсик");
        map.put(cat9.name, cat9);
        Cat cat10 = new Cat("Харсик");
        map.put(cat10.name, cat10);
        return map;
    }

    public static Set<String> convert(HashMap<String, Cat> map) {
        Set<String> name = new HashSet<>();
        name.addAll(map.keySet());
        return name;
    }

    public static Set<Cat> convertCat(HashMap<String, Cat> map) {
        Set<Cat> cats = new HashSet<>();
        for (HashMap.Entry k : map.entrySet()) {
            cats.add((Cat) k.getValue());
        }
        return cats;
    }

    public static void printCat(Set<String> set) {
        for (String s : set) {
            System.out.println(s);
        }
    }

    public static void alterPrint(Set<Cat> set) {
        System.out.println("Альтернативный вывод");
        for (Cat s : set) {
            System.out.println(s.getName());
        }
    }

}
