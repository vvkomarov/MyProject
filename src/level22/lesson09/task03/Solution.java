package level22.lesson09.task03;

/*
Составить цепочку слов
В методе main считай с консоли имя файла, который содержит слова, разделенные пробелом.
В методе getLine используя StringBuilder расставь все слова в таком порядке, чтобы последняя
буква данного слова совпадала с первой буквой следующего не учитывая регистр.
Каждое слово должно участвовать 1 раз.
Метод getLine должен возвращать любой вариант.
Слова разделять пробелом.
Вывести полученную строку на экран.
Пример тела входного файла:
Киев Нью-Йорк Амстердам Вена Мельбурн
Результат:
Амстердам Мельбурн Нью-Йорк Киев Вена
Требования:
1. Метод main должен считывать имя файла с клавиатуры.
2. В методе getLine должен быть использован StringBuilder
3. Метод getLine должен возвращать пустую строку(пустой StringBuilder) в случае если ему не были
переданы параметры(слова).
4. Все слова переданные в метод getLine должны быть включены в результирующую строку, если это возможно.
5. Вывод на экран должен соответствовать условию задачи.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String result = fileReader.readLine();
        fileReader.close();
        StringBuilder builder = getLine(result.split(" "));
        System.out.println(builder);
    }

    private static StringBuilder getLine(String... words) {
        StringBuilder builder = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, words);
        Collections.sort(list);
        if (list.isEmpty()) {
            return null;
        }
        builder.append(list.get(0));
        list.remove(0);

        while (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                String a = list.get(i).toUpperCase().toLowerCase();
                String b = builder.toString().toUpperCase().toLowerCase();
                if (a.charAt(0) == b.charAt(builder.length() - 1)) { // в конец
                    builder.append(" ").append(list.get(i));
                    list.remove(i);
                    continue;
                }

                if (b.charAt(0) == a.charAt(a.length() - 1)) { //в начало
                    builder.insert(0, " ");
                    builder.insert(0, list.get(i));
                    list.remove(i);
                }
            }
        }
        return builder;
    }
}
