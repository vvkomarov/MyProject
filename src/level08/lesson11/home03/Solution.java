package level08.lesson11.home03;

/* Люди с одинаковыми именами и/или фамилиями

1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».

2. Пусть среди этих 10 человек есть люди с одинаковыми именами.

3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.

4. Вывести содержимое Map на экран.

*/

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Map<String, String> people = new HashMap<>();
        addPeople(people);
        getPeople(people);
    }

    public static Map<String, String> addPeople(Map<String, String> people) {
        people.put("Семёнов", "Семён");
        people.put("Семёнов", "Пётр");
        people.put("Никонов", "Никон");
        people.put("Скрипник", "Скрип");
        people.put("Сидоров", "Сидр");
        people.put("Иванов", "Иван");
        people.put("Погребняк", "Семён");
        people.put("Сергеев", "Сергей");
        people.put("Жариков", "Иван");
        people.put("Иванько", "Иван");
        return people;
    }

    public static void getPeople(Map<String, String> people) {
        for (Map.Entry<String, String> b : people.entrySet()) {
            System.out.println(b.getKey() + " " + b.getValue());
        }
    }

}
