package level07.lesson04.task03;

/* 2 массива

1. Создать массив на 10 строк.

2. Создать массив на 10 чисел.

3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.

4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] mass = new String[10];
        int[] k = new int[10];
        for (int j = 0; j < mass.length; j++) {
            mass[j] = reader.readLine();
        }
        for (int j = 0; j < k.length; j++) {
            k[j] = mass[j].length();
        }

        for (int Array : k) System.out.println(Array);
    }

}