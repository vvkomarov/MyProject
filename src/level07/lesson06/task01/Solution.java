package level07.lesson06.task01;


/* 5 различных строчек в списке

1. Создай список строк.

2. Добавь в него 5 различных строчек.

3. Выведи его размер на экран.

4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int k = 0; k < 5; k++) {
            list.add(reader.readLine());
        }
        System.out.println(list.size());

        for (String b : list) {
            System.out.println(b);
        }
    }

}
