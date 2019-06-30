package level19.lesson05.task03;

import java.io.*;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources
Пример тела файла:
12 text var2 14 8v 1
Результат:
12 14 1
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());
        String result = "";
        while (fileReader.ready()) {
            result += ((char) (fileReader.read()));
        }
        fileReader.close();
        String[] number = result.split(" ");
        for (int j = 0; j < number.length; j++) {
            System.out.println(number[j]);
            if (number[j].matches("\\d+")) {
                System.out.println(number[j] + "!");
                fileWriter.write(number[j] + " ");
            }
        }
        fileWriter.close();
    }

}
