package level08.lesson11.bonus02;

/* Нужно добавить в программу новую функциональность

Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.

Новая задача: Программа должна работать не с номерами домов, а с городами:

Пример ввода:

Москва

Ивановы

Киев

Петровы

Лондон

Абрамовичи



Лондон



Пример вывода:

Абрамовичи

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        while (true) {
            String key = reader.readLine();
            if (key.isEmpty()) {
                break;
            } else {
                String value = reader.readLine();
                map.put(key, value);
            }
        }
        String search = reader.readLine();
        System.out.println(map.get(search));
    }

}
