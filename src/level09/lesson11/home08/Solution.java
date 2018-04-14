package level09.lesson11.home08;

/* Список из массивов чисел

Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.

*/

import java.util.ArrayList;
import java.util.Random;

public class Solution {

    public static void main(String[] args) {
        ArrayList<int[]> list = newList();
        addList(list);
        printList(list);
    }

    public static ArrayList<int[]> newList() {
        ArrayList<int[]> list = new ArrayList<>();
        return list;
    }

    public static ArrayList<int[]> addList(ArrayList<int[]> list) {
        int[] a = new int[5];
        int[] b = new int[2];
        int[] c = new int[4];
        int[] d = new int[7];
        int[] e = new int[0];
        for (int j = 0; j < a.length; j++) {
            Random i = new Random();
            a[j] = i.nextInt();
        }
        for (int j = 0; j < b.length; j++) {
            Random i = new Random();
            b[j] = i.nextInt();
        }
        for (int j = 0; j < c.length; j++) {
            Random i = new Random();
            c[j] = i.nextInt();
        }
        for (int j = 0; j < d.length; j++) {
            Random i = new Random();
            d[j] = i.nextInt();
        }
        for (int j = 0; j < e.length; j++) {
            Random i = new Random();
            e[j] = i.nextInt();
        }
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] k : list) {
            System.out.println("Массив: ");
            for (int o : k) {
                System.out.print(o + ", ");
            }
            System.out.println("");
        }
    }

}
