package level05.lesson12.bonus03;

/* Задача по алгоритмам

Написать программу, которая:

1. вводит с консоли число N > 0

2. потом вводит N чисел с консоли

3. выводит на экран максимальное из введенных N чисел.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a = bf.readLine();
        int k = Integer.parseInt(a);
        int max = 0;
        if (k < 0) {
            System.out.println("Число должно быть больше 0");
        } else {
            for (int z = 0; z < k; z++) {
                String y = bf.readLine();
                int o = Integer.parseInt(y);
                if (max < o) {
                    max = o;
                }
            }
        }
        System.out.println(max);
    }

}