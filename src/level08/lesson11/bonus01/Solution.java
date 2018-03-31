package level08.lesson11.bonus01;


/* Номер месяца

Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, String> month = new HashMap();
        addMonth(month);
        String s = reader.readLine();
        for (Map.Entry<Integer, String> k : month.entrySet()) {
            if (s.equals(k.getValue())) {
                System.out.println(s + " is " + k.getKey() + " month");
            }
        }
    }

    public static Map addMonth(Map<Integer, String> month) {
        month.put(1, "Januar");
        month.put(2, "February");
        month.put(3, "March");
        month.put(4, "April");
        month.put(5, "May");
        month.put(6, "June");
        month.put(7, "July");
        month.put(8, "August");
        month.put(9, "September");
        month.put(10, "October");
        month.put(11, "November");
        month.put(12, "December");
        return month;
    }
}
