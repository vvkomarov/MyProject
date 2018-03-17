package level08.lesson08.task02;

/* Удалить все числа больше 10

Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.

Удалить из множества все числа больше 10.

*/

import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Solution {

    public static void main(String[] args) throws ConcurrentModificationException {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        for (int j = 0; j < 20; j++) {
            set.add(random.nextInt(50));
        }
        set.removeIf((Integer element) -> {
            return (element > 10);
        });

        for (int j : set) {
            System.out.println(j);
        }
    }

}
