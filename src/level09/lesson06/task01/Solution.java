package level09.lesson06.task01;

/* Исключение при работе с числами

Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:

int a = 42 / 0;

*/


public class Solution {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println(e + " " + e.getMessage());
        }
    }

    public static void method1() {
        int a = 42 / 0;
    }

}
