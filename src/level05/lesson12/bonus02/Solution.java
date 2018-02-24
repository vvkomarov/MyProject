package level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность

Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.

Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.

*/
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] z = new int[10];
        for (int k = 0; k < z.length; k++) {
            String f = bf.readLine();
            z[k] = Integer.parseInt(f);
        }
        int o = min(z);
        System.out.println(o);
    }

    static int min(int[] g) {
        int min = g[0];
        for (int k = 1; k < g.length; k++) {
            if (min > g[k]) {
                min = g[k];
            }
        }
        return min;
    }

}