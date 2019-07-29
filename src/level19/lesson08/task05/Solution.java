package level19.lesson08.task05;

/* Дублируем текст
Считайте с консоли имя файла
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна дублировать вывод всего текста в файл, имя которого вы считали
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток
Закройте поток файла
Пример вывода на экран:
it's a text for testing
Пример тела файла:
it's a text for testing
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fileWriter = new FileWriter(reader.readLine());
        reader.close();
        PrintStream oldStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream newStream = new PrintStream(byteArrayOutputStream);
        System.setOut(newStream);
        testString.printSomething();
        String result = byteArrayOutputStream.toString();
        System.setOut(oldStream);
        System.out.println(result);
        fileWriter.write(result);
        fileWriter.close();
        oldStream.close();
        newStream.close();
    }


    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }

}