package level07.lesson04.task04;


/* Массив из чисел в обратном порядке

1. Создать массив на 10 чисел.

2. Ввести с клавиатуры 10 чисел и записать их в массив.

3. Расположить элементы массива в обратном порядке.

4. Вывести результат на экран, каждое значение выводить с новой строки.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] k = new int[10];
        for (int j = 0; j < k.length; j++) {
            k[j] = Integer.parseInt(reader.readLine());
        }

        for (int j = k.length - 1; j >= 0; j--) {
            System.out.println(k[j]);
        }
    }

}
