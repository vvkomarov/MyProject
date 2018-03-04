package level07.lesson09.task01;

/* Три массива

1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:

Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.

Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.

2. Метод printList должен выводить на экран все элементы списка  с новой строки.

3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws Exception {

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> xxx = new ArrayList<Integer>();
        ArrayList<Integer> xx = new ArrayList<Integer>();
        ArrayList<Integer> x = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int k = 0; k < 20; k++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int k = 0; k < list.size(); k++) {
            if (list.get(k) % 3 == 0) {
                xxx.add(list.get(k));
            } else if (list.get(k) % 2 == 0) {
            } else {
                x.add(list.get(k));
            }
            if (list.get(k) % 2 == 0) {
                xx.add(list.get(k));
            }
        }
        printList(xxx);
        printList(xx);
        printList(x);
    }

    public static void printList(ArrayList<Integer> k) {
        for (int s : k) {
            System.out.println(s);
        }
    }

}