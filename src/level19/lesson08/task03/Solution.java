package level19.lesson08.task03;

/* Выводим только цифры
        В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
        Ваша ридер-обертка должна выводить только цифры
        Вызовите готовый метод printSomething(), воспользуйтесь testString
        Верните переменной System.out первоначальный поток
        Вывести модифицированную строку в консоль.
        Пример вывода:
        12345678
        */

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Solution {
    public static TestString testString = new TestString();
    public static ArrayList<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) {
        PrintStream outStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byteArrayOutputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = byteArrayOutputStream.toString().replaceAll("\\D", "");
        System.setOut(outStream);
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
