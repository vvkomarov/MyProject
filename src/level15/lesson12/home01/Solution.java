package level15.lesson12.home01;

/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.equals("exit")) break;
            try {
                Double a = Double.parseDouble(s);
                if (s.contains(".")) {
                    print(a);
                } else {
                    Integer b = (int) Math.round(a);
                    if (b >= 128) {
                        print(b);
                    } else {
                        short c = (short) b.intValue();
                        print(c);
                    }
                }
            } catch (Exception e) {
                print(s);
            }
        }
    }

    static void print(Double a) {
        System.out.println("Это тип Double, значение " + a);
    }

    static void print(short a) {
        System.out.println("Это тип short, значение " + a);
    }

    static void print(Integer a) {
        System.out.println("Это тип Integer, значение " + a);
    }

    static void print(String a) {
        System.out.println("Это тип String, значение " + a);
    }
}