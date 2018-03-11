package level08.lesson06.task02;

/* Провести 10 тысяч вставок, удалений

Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.

*/

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Solution {

    public static void main(String[] args) {
        LinkedList<Integer> LList = new LinkedList<>();
        ArrayList<Integer> AList = new ArrayList<>();
        Date date = new Date();
        for (int j = 0; j < 10000; j++) {
            LList.add(j);
        }
        for (int j = 0; j < 10000; j++) {
            LList.get(j);
        }
        for (int j = 0; j < 10000; j++) {
            LList.set(10, j);
        }
        for (int j = 0; j < 10000; j++) {
            LList.remove(0);
        }
        Date date2 = new Date();
        long result = date2.getTime() - date.getTime();
        System.out.println(result);

        Date date3 = new Date();
        for (int j = 0; j < 10000; j++) {
            AList.add(j);
        }
        for (int j = 0; j < 10000; j++) {
            AList.get(j);
        }
        for (int j = 0; j < 10000; j++) {
            AList.set(10, j);
        }
        for (int j = 0; j < 10000; j++) {
            AList.remove(0);
        }
        Date date4 = new Date();
        System.out.println(date4.getTime() - date3.getTime());
    }

}
