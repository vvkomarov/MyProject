package level10.lesson11.bonus03;

/* Задача по алгоритмам
Задача: ввести с клавиатуры 30 чисел. Вывести 10-е и 11-е минимальные числа.
Пояснение:
Самое минимальное число – 1-е минимальное.
Следующее минимальное после него – 2-е минимальное

Пример:
1 6 5  7  1  15   63   88
Первое минимальное – 1
Второе минимальное – 1
Третье минимальное – 5
Четвертое минимальное – 6
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < 30; j++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        sort(list);
    }

    public static void sort(List<Integer> list) {
        List<Integer> min = new ArrayList<>();
        for (int k = 0; k < list.size(); ) {
            int mn = list.get(0);
            int index = 0;
            for (int j = 0; j < list.size(); j++) {
                if (mn > list.get(j)) {
                    mn = list.get(j);
                    index = j;
                }
            }
            min.add(mn);
            list.remove(index);
        }
        System.out.println(min.get(10));
        System.out.println(min.get(11));
    }

}