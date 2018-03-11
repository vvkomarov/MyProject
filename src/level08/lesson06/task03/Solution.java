package level08.lesson06.task03;

/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка

Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.

Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.

*/

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        getTimeMsOfInsert(new ArrayList<>());
        getTimeMsOfInsert(new LinkedList<>());

    }

    public static void getTimeMsOfInsert(List<Integer> list) {
        Date start = new Date();
        insert10000(list);
        Date end = new Date();
        System.out.println("Затраченное время " + (end.getTime() - start.getTime()));
        /*for (Integer k : list) {
            System.out.print(k);
        }*/
    }

    private static void insert10000(List<Integer> list) {
        for (int j = 0; j < 10000; j++) {
            list.add(0, j);
        }
    }
}