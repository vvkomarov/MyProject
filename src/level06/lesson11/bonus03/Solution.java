package level06.lesson11.bonus03;

/* Задача по алгоритмам

Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода:

3

2

15

6

17

Пример вывода:

2

3

6

15

17

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[5];
        for (int k = 0; k < mass.length; k++) {
            mass[k] = Integer.parseInt(reader.readLine());
        }

        functionMax(mass);

    }

    public static void functionMax(int[] k) {
        for (int o = 0; o < k.length; o++) {
            for (int j = o + 1; j < k.length; j++) {
                if (k[o] > k[j]) {
                    int tmp = k[o];
                    k[o] = k[j];
                    k[j] = tmp;
                }
            }
        }
        for (int aMassive : k) System.out.println(aMassive);
    }
}