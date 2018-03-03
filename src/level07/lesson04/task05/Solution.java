package level07.lesson04.task05;

/* Один большой массив и два маленьких

1. Создать массив на 20 чисел.

2. Ввести в него значения с клавиатуры.

3. Создать два массива на 10 чисел каждый.

4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.

5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {

        int[] k = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int j = 0; j < k.length; j++) {
            k[j] = Integer.parseInt(reader.readLine());
        }
        int[] o = new int[10];
        int[] p = new int[10];
        /*for (int g = 0; g < k.length; g++) {
            if ( g < 10) {
                o[g] = k[g];
            } else {
                p[g-10] = k[g];
            }
        }*/
        System.arraycopy(k, 0, o, 0, o.length);
        System.arraycopy(k, 10, p, 0, p.length);
        for (int Array : p) System.out.println(Array);
    }

}
