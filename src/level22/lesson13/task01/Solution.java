package level22.lesson13.task01;

/*
StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.
Пример
getTokens("level22.lesson13.task01", ".")
Возвращает
{"level22", "lesson13", "task01"}
Требования:
1. Метод getTokens должен использовать StringTokenizer.
2. Метод getTokens должен быть публичным.
3. Метод getTokens должен принимать два параметра типа String.
4. Массив типа String возвращенный методом getTokens должен быть заполнен правильно(согласно условию задачи).
*/

import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) {
        String[] b = getTokens("level22.lesson13.task01", ".");
        for (String k : b) {
            System.out.println(k);
        }

        String[] strings = getTokens("Orange,Green,Yellow,Red", ",");

        for (String s : strings)
            System.out.println(s);
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);

        String[] q = new String[tokenizer.countTokens()];
        for (int j = 0; tokenizer.hasMoreElements(); j++) {
            q[j] = tokenizer.nextToken();
        }
        return q;
    }
}
