package level08.lesson11.home04;

/* Минимальное из N чисел

1. Ввести с клавиатуры число N.

2. Считать N целых чисел и заполнить ими список - метод getIntegerList.

3. Найти минимальное число среди элементов списка - метод getMinimum.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list = getIntegerList(n);
        getMinimum(list);
    }

    public static ArrayList<Integer> getIntegerList(int n) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int j = 0; j < n; j++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }

    public static void getMinimum(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) < min) {
                min = list.get(j);
            }
        }
        System.out.println(min);
    }

}
