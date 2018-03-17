package level08.lesson08.task03;

/* Одинаковые имя и фамилия

Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».

Проверить сколько людей имеют совпадающие с заданным имя или фамилию.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        addMap(map);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstname;
        String lastname;
        System.out.println("Поиск по 'Имя' или 'Фамилия'");
        while (true) {
            String s = reader.readLine();
            if (s.equals("Имя")) {
                System.out.println("Введите имя");
                firstname = reader.readLine();
                GetCountfirstname(firstname, map);
                break;
            } else if (s.equals("Фамилия")) {
                System.out.println("Введите фамилию");
                lastname = reader.readLine();
                GetCountlastname(lastname, map);
                break;
            } else {
                System.out.println("Введён неверный параметр");
                break;
            }
        }

    }

    public static Map<String, String> addMap(Map s) {
        s.put("Петров", "Пётр");
        s.put("Иванов", "Иван");
        s.put("Николев", "Николай");
        s.put("Сергеев", "Сергей");
        s.put("Юрьев", "Юрий");
        s.put("Геннадьев", "Геннадий");
        s.put("Павлов", "Павел");
        s.put("Михаилов", "Михаил");
        s.put("Илюхин", "Илья");
        s.put("Лагутенко", "Илья");
        return s;
    }

    public static void GetCountfirstname(String firstname, HashMap<String, String> map) {
        int count = 0;
        for (HashMap.Entry<String, String> b : map.entrySet()) {
            String value = b.getValue();
            if (value.equals(firstname)) {
                count++;
            }
        }
        System.out.println("С таким именем найдено " + count);
    }

    public static void GetCountlastname(String lastname, HashMap<String, String> map) {
        int count = 0;
        for (HashMap.Entry<String, String> b : map.entrySet()) {
            String key = b.getKey();
            if (key.equals(lastname)) {
                count++;
            }
        }
        System.out.println("С такой фамилией найдено " + count);
    }

}