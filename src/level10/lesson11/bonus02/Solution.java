package level10.lesson11.bonus02;

/* Нужно добавить в программу новую функциональность

Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.

Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.

Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!

Затем программа выводит содержание HashMap на экран.



Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мама
2 Рама
1 Мыла
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            try {
                int k = Integer.parseInt(reader.readLine());
                map.put(reader.readLine(), k);
            } catch (NumberFormatException e) {
                break;
            }
        }
        print(map);
    }

    public static void print(HashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> b : map.entrySet()) {
            System.out.println(b.getValue() + " " + b.getKey());
        }
    }

}