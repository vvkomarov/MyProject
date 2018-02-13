package level04.lesson16.tsk03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу. -1 должно учитываться в сумме.
 */
public class Solution {
    public static void main(String args[]) throws  Exception{
        BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
        int k = 0;
        int j = 0;
        while (k != -1) {
            String a = bd.readLine();
            k = Integer.parseInt(a);
            j = j + k;
        }
        System.out.println(j);
    }
}
