package level07.lesson06.task04;

/* 5 строчек в начало списка

1. Создай список строк.

2. Добавь в него 5 строчек с клавиатуры, но только добавлять не в конец списка, а в начало. 3.

3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int j = 0; j < 5; j++) {
            list.add(0, reader.readLine());
        }
        for (String j : list) {
            System.out.println(j);
        }
    }

}
