package level08.lesson11.home05;

/* Мама Мыла Раму. Теперь с большой буквы

Написать программу, которая вводит с клавиатуры строку текста.

Программа заменяет в тексте первые буквы всех слов на заглавные.

Пример ввода:

мама     мыла раму.

Пример вывода:

Мама     Мыла Раму.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] ch = s.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        for (int j = 1; j < ch.length; j++) {
            if (j != ch.length - 1) {
                if (ch[j] == ' ') {
                    ch[j + 1] = Character.toUpperCase(ch[j + 1]);
                }
            }
        }
        for (Character c : ch) {
            System.out.print(c);
        }
    }

}
