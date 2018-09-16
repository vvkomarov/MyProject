package level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        NOD(a, b);
    }

    public static void NOD(int a, int b) {
        int nod = 1;
        for (int j = 1; j <= a; j++) {
            if ((a % j == 0) & (b % j == 0)) {
                nod = j;
            }
        }
        System.out.println(nod);
    }

}