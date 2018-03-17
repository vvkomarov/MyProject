package level08.lesson08.task01;

/* 20 слов на букву «Л»

Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».

*/

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] rags) {
        Set<String> hash = new HashSet<>();
        for (int j = 0; j < 20; j++) {
            hash.add("Ляпота" + j);
        }
        for (String b : hash) {
            System.out.println(b);
        }
    }

}