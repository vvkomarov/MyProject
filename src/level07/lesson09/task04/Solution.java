package level07.lesson09.task04;

/* Буква «р» и буква «л»

1. Создай список слов, заполни его самостоятельно.

2. Метод fix должен:

2.1. удалять из списка строк все слова, содержащие букву «р»

2.2. удваивать все слова содержащие букву «л».

2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.

Пример:

роза

лира

лоза

Выходные данные:

лира

лоза

лоза

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int j = 0; j < 3; j++) {
            list.add(reader.readLine());
        }
        fix(list);
        for (String b : list) {
            System.out.println(b);
        }
    }

    public static ArrayList fix(ArrayList<String> k) {
        for (int j = 0; j < k.size(); j++) {
            if (k.get(j).contains("л") && k.get(j).contains("р")) {

            } else if (k.get(j).contains("л")) {
                k.add(j, k.get(j));
                j++;
            } else if (k.get(j).contains("р")) {
                k.remove(j);
            }
        }
        return k;
    }
}