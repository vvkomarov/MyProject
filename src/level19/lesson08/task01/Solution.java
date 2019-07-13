package level19.lesson08.task01;

/* Ридер обертка
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна преобразовывать весь текст в заглавные буквы
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток.
Вывести модифицированную строку в консоль.
*/

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        //запоминаем настоящий PrintStream в специальную переменную
        PrintStream consoleStream = System.out; //запоминаем настоящий PrintStream в специальную переменную,
        // дабы потом вернуть его в изначальном виде.

        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); //создаем ссылку на поток в виде динамического массив байтов

        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream); //создаем адаптер к классу PrintStream - ссылку
        // на свой поток из ранее объявленного динамического массива байтов

        //Устанавливаем его как текущий System.out
        System.setOut(stream); //Устанавливаем свой поток/адаптер как текущее значение System.out

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething(); //Вызываем функцию, которая по умолчанию выводит  в консоль сиречь PrintStream текст "it's a text for testing", но!
        // PrintStream подменен нами на этом этапе выполнения программы на свой адаптер - массив байтов.

        //Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString().toUpperCase(); //переводим в "обертке" result все буквы в заглавные
        // из подмененного нами PrintStream, в котором на данный момент валяется без дела строка
        // "it's a text for testing" из printSomething() в виде массива байтов

        //Возвращаем все как было
        System.setOut(consoleStream);// возвращаем переменной setOut исходное значение

        //Выводим модифицированную строку в консоль
        System.out.println(result); // в итоге строка выводится в upperCase, согласно нашей обертке
        consoleStream.close();
        outputStream.close();
        stream.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }

}
