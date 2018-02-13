package level04.lesson10.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз, используя цикл while.

Пример ввода:
абв
2
Пример вывода:
абв
абв
 */
public class Solution {
    public static void main(String arg[]) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a = bf.readLine();
        String b = bf.readLine();
        int k = Integer.parseInt(b);
        int c = 1;
        while (c <= k) {
            System.out.println(a);
            c++;
        }
    }
}
