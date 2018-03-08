package level07.lesson09.task05;

/* Удвой слова

1. Введи с клавиатуры 10 слов в список строк.

2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.

3. Используя цикл for выведи результат на экран, каждое значение с новой строки.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            list.add(reader.readLine());
        }
        doubleValues(list);
        for (String b : list) {
            System.out.println(b);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList list) {
        for (int j = 0; j < list.size(); j++) {
            list.add(j, list.get(j));
            j++;
        }
        return list;
    }
}
