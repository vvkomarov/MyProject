package level07.lesson12.home01;

/* Вывести числа в обратном порядке

Ввести с клавиатуры 10 чисел и заполнить ими список.

Вывести их в обратном порядке.

Использовать только цикл for.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int j = list.size() - 1; j >= 0; j--) {
            System.out.println(list.get(j));
        }
    }

}
