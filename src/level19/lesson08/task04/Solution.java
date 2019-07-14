package level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток
Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.
Пример вывода:
3 + 6 = 9
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream outStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byteArrayOutputStream);
        System.setOut(stream);
        testString.printSomething();
        String[] result = byteArrayOutputStream.toString().split(" ");
        System.setOut(outStream);
        int res = 0;
        switch (result[1]) {
            case "+":
                res = Integer.parseInt(result[0]) + Integer.parseInt(result[2]);
                break;
            case "-":
                res = Integer.parseInt(result[0]) - Integer.parseInt(result[2]);
                break;
            case "*":
                res = Integer.parseInt(result[0]) * Integer.parseInt(result[2]);
                break;
        }
        System.out.print(byteArrayOutputStream.toString().replaceAll("\r\n", "") + res);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}
