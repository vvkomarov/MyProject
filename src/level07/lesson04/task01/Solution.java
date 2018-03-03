package level07.lesson04.task01;


/* Максимальное среди массива на 20 чисел

1. В методе initializeArray():

1.1. Создайте массив на 20 чисел

1.2. Считайте с консоли 20 чисел и заполните ими массив

2. Метод max(int[] array) должен находить максимальное число из элементов массива

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {

        int[] o = new int[20];
        Solution.initializeArray(o);
        Solution.max(o);
    }

    public static int[] initializeArray(int[] j) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < j.length; i++) {
            j[i] = Integer.parseInt(reader.readLine());
        }
        return j;
    }

    public static void max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
