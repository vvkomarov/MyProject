package level08.lesson11.home09;

/*
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
*/

import java.text.ParseException;
import java.util.Date;

public class Solution {

    public static void main(String[] args) throws ParseException {
        String date = "MAY 01 2018";
        if (isDateOdd(date) == true) {
            System.out.println("Колличество дней нечётное");
        } else {
            System.out.println("Колличество дней чётное");
        }
    }

    public static boolean isDateOdd(String date) throws ParseException {
        Date year = new Date("JANUAR 01 2018");
        Date now = new Date(date);
        long milisec = now.getTime() - year.getTime();
        System.out.println(year);
        if (milisec / 1000 / 60 / 60 / 24 % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

}