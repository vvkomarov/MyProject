package level10.lesson04.task02;

/* Задача №2 на преобразование целых типов

Расставь где нужно оператор приведения типа:

int a = 15;

int b = 4;

float c = (a / (double)b);

double d = a * 1e-3;

Расставьте правильно операторы приведения типа, чтобы получился ответ: d = 3.765

*/

public class Solution {

    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = (float) (a / (double) b);
        double d = a * 1e-3 + c;
        System.out.println(d);
    }

}
