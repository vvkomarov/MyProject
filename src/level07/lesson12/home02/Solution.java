package level07.lesson12.home02;

/* Переставить M первых строк в конец списка

Ввести с клавиатуры 2 числа N  и M.

Ввести N строк и заполнить ими список.

Переставить M первых строк в конец списка.

Вывести список на экран, каждое значение с новой строки.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int j = 0; j < N; j++) {
            list.add(reader.readLine());
        }
        for (int j = 0; j < M; j++) {
            list.add(list.get(0));
            list.remove(0);
        }
        for (String b : list) {
            System.out.println(b);
        }
    }

}
