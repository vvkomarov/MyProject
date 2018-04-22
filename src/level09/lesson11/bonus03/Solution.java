package level09.lesson11.bonus03;

/* Задача по алгоритмам

Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.

Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз

Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException {
        ArrayList<String> word = addItems();
        sortItems(word);
        printItem(word);
    }

    public static ArrayList<String> addItems() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> word = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            } else {
                word.add(s);
            }
        }
        return word;
    }

    public static ArrayList<String> sortItems(ArrayList<String> list) {
        List<Integer> numb = new ArrayList<>();
        List<Integer> word = new ArrayList<>();
        for (int j = 0; j < list.size(); j++) {
            try {
                int k = Integer.parseInt(list.get(j));
                numb.add(j);
            } catch (NumberFormatException e) {
                word.add(j);
            }
        }
        sortNumb(list, numb);
        sortWord(list, word);
        return list;
    }

    public static ArrayList<String> sortNumb(ArrayList<String> list, List<Integer> numb) {
        if (numb.size() > 0) {
            ArrayList<Integer> number = new ArrayList<>();

            for (int j = 0; j < numb.size(); j++) {
                number.add(Integer.parseInt(list.get(numb.get(j))));
            }

            for (int j = 0; j < number.size(); j++) {
                for (int k = j + 1; k < number.size(); k++) {
                    if (number.get(j) < number.get(k)) {
                        int temp = number.get(j);
                        number.set(j, number.get(k));
                        number.set(k, temp);
                    }
                }
            }

            for (int j = 0; j < numb.size(); j++) {
                list.set(numb.get(j), number.get(j).toString());
            }

            return list;
        } else {
            return list;
        }
    }

    public static ArrayList<String> sortWord(ArrayList<String> list, List<Integer> word) {
        if (word.size() > 0) {
            ArrayList<String> words = new ArrayList<>();

            for (int j = 0; j < word.size(); j++) {
                words.add(list.get(word.get(j)));
            }

            for (int j = 0; j < word.size(); j++) {
                for (int k = j + 1; k < word.size(); k++) {
                    if (compareString(words.get(j), words.get(k)) == true) {
                        String temp = words.get(j);
                        words.set(j, words.get(k));
                        words.set(k, temp);
                    }
                }
            }

            for (int j = 0; j < word.size(); j++) {
                list.set(word.get(j), words.get(j));
            }

            return list;
        } else {
            return list;
        }
    }

    public static void printItem(ArrayList<String> list) {
        for (String b : list) {
            System.out.println(b);
        }
    }

    public static boolean compareString(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
