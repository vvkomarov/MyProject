package level07.lesson12.bonus02;

/* Нужно добавить в программу новую функциональность

Задача:  Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter). Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter). Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.

Пример ввода:

Кот

Коты

Я

Пример вывода:

Кот Кот Кот

Коты Коты

Я Я Я

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            } else {
                list.add(s);
            }
        }

        for (int k = 0; k < list.size(); k++) {
            if (list.get(k).length() % 2 == 0) {
                list.set(k, list.get(k) + " " + list.get(k));
            } else {
                list.set(k, list.get(k) + " " + list.get(k) + " " + list.get(k));
            }
        }

        for (String b : list) {
            System.out.println(b.toUpperCase());
        }
    }

}