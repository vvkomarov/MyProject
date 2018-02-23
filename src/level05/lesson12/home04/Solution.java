package level05.lesson12.home04;
/* Вывести на экран сегодняшнюю дату

Вывести на экран текущую дату в аналогичном виде "21 12 2012".

*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date.getDate() + " " + date.getMonth() + " " + date.getYear());
        SimpleDateFormat date2 = new SimpleDateFormat("dd MM YYYY");
        System.out.println(date2.format(date));
    }

}
