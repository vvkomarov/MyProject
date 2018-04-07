package level09.lesson06.task05;
/* Исключение при работе с коллекциями Map

Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:

HashMap<String, String> map = new HashMap<String, String>(null);

map.put(null, null);

map.remove(null);

*/

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        try {
            map.put(null, null);
            map.remove(null);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}