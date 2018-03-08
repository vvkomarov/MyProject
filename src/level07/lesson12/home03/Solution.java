package level07.lesson12.home03;

/* Максимальное и минимальное числа в массиве

Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.

Вывести на экран максимальное и минимальное числа через пробел.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < 20; j++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int min = list.get(0);
        int max = list.get(0);
        for (int j = 1; j < list.size(); j++) {
            if (min > list.get(j)) {
                min = list.get(j);
            } else if (max < list.get(j)) {
                max = list.get(j);
            }
        }
        System.out.println("Max :" + max + ", Min :" + min);
    }

}
