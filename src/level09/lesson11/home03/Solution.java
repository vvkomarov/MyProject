package level09.lesson11.home03;

/* Метод в try..catch

Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.

Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа) этого метода в try..catch.

Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.

Числа выводить с новой строки сохраняя порядок ввода

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws IOException {
        readData();
    }

    public static void readData() throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                list.add(Integer.parseInt(reader.readLine()));
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
            for (Integer j : list) {
                System.out.println(j);
            }
        }
    }

}
