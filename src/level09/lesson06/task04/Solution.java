package level09.lesson06.task04;

/* Исключение при работе с коллекциями List

Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:

ArrayList<String> list = new ArrayList<String>();

String s = list.get(18);

*/

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try {
            String s = list.get(18);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
