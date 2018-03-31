package level08.lesson11.bonus03;

/* Задача по алгоритмам

Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static String[] sort(String[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int k = j + 1; k < array.length; k++) {
                if (isGreaterThen(array[j], array[k]) == true) {
                    String temp = array[j];
                    array[j] = array[k];
                    array[k] = temp;
                }
            }
        }
        return array;
    }

    //Метод для сравнения строк: 'а' больше чем 'b'

    private static boolean isGreaterThen(String a, String b) {

        return a.compareTo(b) > 0;

    }

}
