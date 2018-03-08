package level07.lesson12.home04;

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'

Создать список строк.

Ввести строки с клавиатуры и добавить их в список.

Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.

Вывести строки на экран, каждую с новой строки.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.equals("end")) {
                break;
            } else {
                list.add(s);
            }
        }
        for (String b : list) {
            System.out.println(b);
        }
    }

}