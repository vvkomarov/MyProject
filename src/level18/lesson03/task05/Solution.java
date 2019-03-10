package level18.lesson03.task05;

/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        reader.close();
        while (fileInputStream.available() > 0) {
            write(fileInputStream.read());
        }
        fileInputStream.close();
        sort(list);
        print(list);
    }

    public static void write(int k) {
        if (!list.contains(k)) {
            list.add(k);
        }
    }

    public static void sort(ArrayList<Integer> ls) {
        for (int j = 0; j < ls.size(); j++) {
            for (int k = j + 1; k < ls.size(); k++) {
                if (ls.get(j) > ls.get(k)) {
                    int time = ls.get(j);
                    ls.set(j, ls.get(k));
                    ls.set(k, time);
                }
            }
        }
    }

    public static void print(ArrayList<Integer> ls) {
        for (int j : list) {
            System.out.println(j);
        }
    }

}
