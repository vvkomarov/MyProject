package level18.lesson03.task03;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    static Map<Integer, Integer> maxbyte = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        while (inputStream.available() > 0) {
            check(inputStream.read());
        }
        reader.close();
        inputStream.close();
        print(maxbyte);
    }

    public static void check(int value) {
        if (maxbyte.containsKey(value)) {
            for (Map.Entry<Integer, Integer> entry : maxbyte.entrySet()) {
                if (entry.getKey().equals(value)) {
                    entry.setValue(entry.getValue() + 1);
                }
            }
        } else {
            maxbyte.put(value, 1);
        }
    }

    public static void print(Map<Integer, Integer> map) {
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }

        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
            }
        }
    }
}