package level15.lesson12.bonus03;

/* Факториал
Написать метод, который вычисляет факториал - произведение всех чисел от 1 до введенного числа включая его.
Пример: 4! = factorial(4) = 1*2*3*4 = 24
1. Ввести с консоли число меньше либо равно 150.
2. Реализовать функцию  factorial.
3. Если введенное число меньше 0, то вывести 0.
0! = 1
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int factorial = Integer.parseInt(reader.readLine());
        reader.close();
        if (factorial <= 150) {
            System.out.println(factorial(factorial));
        }
    }

    public static String factorial(int n) {
        if (n == 0) {
            return "0! = 1";
        } else {
            BigInteger result = new BigInteger("1");
            for (long j = 1; j <= n; j++) {
                result = result.multiply(BigInteger.valueOf(j));
            }
            return n + "! = " + result;
        }
    }

}
