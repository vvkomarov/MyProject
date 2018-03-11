package level08.lesson06.task04;

/* Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка

Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.

Метод getTimeMsOfGet  должен вернуть время его исполнения в миллисекундах.

*/


import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] rags) {
        getTimeMsOfGet(new ArrayList<>());
        getTimeMsOfGet(new LinkedList<>());
    }

    private static void insert10000(List<Integer> list) {
        for (int j = 0; j < 10000; j++) {
            list.add(0, j);
        }
    }

    private static void get10000(List list) {
        for (int j = 0; j < 10000; j++) {
            list.get(5000);
        }
    }

    public static void getTimeMsOfGet(List list) {
        insert10000(list);
        Date start = new Date();
        get10000(list);
        Date end = new Date();
        System.out.println(end.getTime() - start.getTime());
    }

}
