package level07.lesson09.task02;

/* 5 слов в обратном порядке

Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList list = new ArrayList();
        for (int j = 0; j < 5; j++) {
            list.add(reader.readLine());
        }
        list.remove(2);
        for (int j = 3; j >= 0; j--) {
            System.out.println(list.get(j));
        }
    }

}
