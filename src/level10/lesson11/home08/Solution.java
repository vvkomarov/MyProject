package level10.lesson11.home08;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws IOException {

        ArrayList<ArrayList> list = new ArrayList<>();
        add(list);
        print(list);
    }

    public static ArrayList<ArrayList> add(ArrayList<ArrayList> list) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int k = 0; k < 3; k++) {
            ArrayList<String> lisp = new ArrayList<>();
            while (true) {
                String s = reader.readLine();
                if (s.isEmpty()) {
                    break;
                } else {
                    lisp.add(s);
                }
            }
            list.add(lisp);
        }
        return list;
    }

    public static void print(ArrayList<ArrayList> list) {
        for (ArrayList s : list) {
            System.out.println(s);
        }
    }

}
