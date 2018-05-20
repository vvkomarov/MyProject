package level10.lesson11.home05;

/* Количество букв

Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.

Пример вывода:
а 5
б 8
в 3
г 7
…
я 9
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> st = new ArrayList<>();
        for (int k = 0; k < 10; k++) {
            st.add(reader.readLine().toLowerCase());
        }
        HashMap<Character, Integer> result = new HashMap<>();
        addMap(result, st);
        print(result);
    }

    public static HashMap<Character, Integer> addMap(HashMap<Character, Integer> result, ArrayList<String> st) {
        for (String b : st) {
            char[] c = b.toCharArray();
            for (int j = 0; j < c.length; j++) {
                if (result.containsKey(c[j]) == false) {
                    result.put(c[j], 1);
                } else {
                    for (Map.Entry<Character, Integer> entry : result.entrySet()) {
                        if (c[j] == entry.getKey()) {
                            entry.setValue(entry.getValue() + 1);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void print(HashMap<Character, Integer> result) {
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}