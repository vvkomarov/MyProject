package level07.lesson12.bonus03;

/* Задача по алгоритмам

Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < 20; j++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        Sort(list);
    }

    public static void Sort(ArrayList<Integer> list) {
        for (int j = 0; j < list.size(); j++) {
            int index = j;
            for (int k = j + 1; k < list.size(); ) {
                if (list.get(j) < list.get(k)) {
                    int temp = list.get(j);
                    list.set(j, list.get(k));
                    list.remove(k);
                    list.add(temp);
                } else {
                    k++;
                }
            }
        }
        for (Integer s : list) {
            System.out.println(s);
        }
    }

}
