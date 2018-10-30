package level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        try {
            String[] result = url.split("\\?");
            for (String b : result) {
                String[] result2 = b.split("&");
                if (b.contains("&")) {
                    for (String c : result2) {
                        int index = c.indexOf("=");
                        if (index != -1) System.out.print(c.substring(0, index) + " ");
                        else System.out.print(c + " ");
                    }
                    for (String c : result2) {
                        if (c.contains("obj")) {
                            int index = c.indexOf("=");
                            try {
                                double n = Double.parseDouble(c.substring(index + 1));
                                System.out.println("");
                                alert(n);
                            } catch (Exception e) {
                                alert(c.substring(index));
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}