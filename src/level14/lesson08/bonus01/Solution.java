package level14.lesson08.bonus01;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

import org.omg.PortableServer.CurrentPackage.NoContext;
import sun.misc.InvalidJarIndexException;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        int j = 0;
        while (j < 1) {
            try {
                float i = 1 / 0;
            } catch (Exception e) {
                exceptions.add(e);
            }
            j++;
        }
        //Add your code here
        List<Integer> list = new ArrayList<>();
        try {
            list.get(5);
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            String a = "Пётр";
            list.add(Integer.parseInt(a));
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }
        exceptions.add(new NullPointerException());
        exceptions.add(new ArithmeticException());
        exceptions.add(new StringIndexOutOfBoundsException());
        exceptions.add(new NoContext());
        exceptions.add(new InvalidJarIndexException());
        exceptions.add(new ExportException("Ghbdtn"));
        exceptions.add(new Exception());
    }
}