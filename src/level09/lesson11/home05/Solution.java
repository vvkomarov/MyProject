package level09.lesson11.home05;

/* Гласные и согласные буквы

Написать программу, которая вводит с клавиатуры строку текста.

Программа должна вывести на экран две строки:

1. первая строка содержит только гласные буквы

2. вторая - только согласные буквы и знаки препинания из введённой строки.

Буквы соединять пробелом.



Пример ввода:

Мама мыла раму.

Пример вывода:

а а ы а а у

М м м л р м .

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] b = reader.readLine().toCharArray();
        String g = "";
        String s = "";
        for (char c : b) {
            if (c != ' ') {
                if (check(c) == true) {
                    g += c + " ";
                } else {
                    s += c + " ";
                }
            }
        }
        System.out.println(g);
        System.out.println(s);
    }

    public static boolean check(char c) {
        String gl = "УуЕеЫыАаОоЭэЯяИиЮю";
        return gl.matches("(.*)" + Character.toString(c) + "(.*)");
    }

}
