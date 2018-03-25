package level08.lesson11.home08;

/* Пять наибольших чисел

Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        addList(list);
        for (int k : set5Max(list)) {
            System.out.println(k);
        }
    }

    public static ArrayList addList(ArrayList<Integer> list) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int j = 0; j < 20; j++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }

    public static ArrayList randomList(ArrayList<Integer> list) {

        for (int j = 0; j < 20; j++) {
            Random k = new Random();
            list.add(k.nextInt(100));
        }
        return list;
    }

    public static ArrayList<Integer> set5Max(ArrayList<Integer> list) {
        ArrayList<Integer> maximum = new ArrayList<>();
        int max = 0;
        int number = 0;
        for (int k = 0; k < 5; k++) {
            for (int j = 0; j < list.size(); j++) {
                if (max < list.get(j)) {
                    max = list.get(j);
                    number = j;
                }
            }
            maximum.add(max);
            max = 0;
            list.remove(number);
        }
        return maximum;
    }

}