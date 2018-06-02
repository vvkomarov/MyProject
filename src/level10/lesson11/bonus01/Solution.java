package level10.lesson11.bonus01;


/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа демонстрирует работу HashMap: вводит с клавиатуры набор пар (номер и строку), помещает их в HashMap и выводит на экран содержимое HashMap.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            } else {
                map.put(s, Integer.parseInt(reader.readLine()));
            }
        }
        printMap(map);
    }

    public static void printMap(HashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> b : map.entrySet()) {
            System.out.println(b.getKey() + " " + b.getValue());
        }
    }

}
