package level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader read = new BufferedReader(new FileReader(reader.readLine()));
        //String result;
        ArrayList<Integer> list = new ArrayList<>();
        /*
        while ((result = read.readLine()) != null) {
            if (Integer.parseInt(result) % 2 == 0) {
                list.add(Integer.parseInt(result));
            }
        } */
        while (read.ready()) {
            int number = Integer.parseInt(read.readLine());
            if (number % 2 == 0) {
                list.add(number);
            }
        }
        /*for (int j = 0; j < list.size(); j++) {
            try {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            } catch (IndexOutOfBoundsException e) {

            }
        }*/
        Collections.sort(list);
        for (int k : list) {
            System.out.println(k);
        }
        reader.close();
        read.close();
    }
}