package level05.lesson12.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/* Вводить с клавиатуры числа и считать их сумму

Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.

*/
public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int b = 0;
        while (true) {
            String a = bf.readLine();
            if (a.equals("сумма")) {
                break;
            } else {
                try {
                    int c = Integer.parseInt(a);
                    b = b + c;
                } catch (Exception v) {
                    System.out.println(v);
                    System.out.println("Введено не число");
                }
            }
        }
        System.out.println(b);
    }
}