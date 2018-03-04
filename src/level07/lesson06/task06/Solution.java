package level07.lesson06.task06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Задача 3. Самая короткая строка

        1. Создай список строк.
        2. Считай с клавиатуры 5 строк и добавь в список.
        3. Используя цикл, найди самую короткую строку в списке.
        4. Выведи найденную строку на экран.
        5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution {

    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int j = 0; j < 5; j++) {
            list.add(0, reader.readLine());
        }
        String s = list.get(0);
        int min = s.length();
        for (int k = 1; k < list.size(); k++) {
            if (s.length() > list.get(k).length()) {
                min = list.get(k).length();
            }
        }
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j).length() > min) {
                String kill = list.get(j);
                list.remove(j);
                j = 0;
            }
        }
        for (String b : list) {
            System.out.println(b);
        }
    }
}
