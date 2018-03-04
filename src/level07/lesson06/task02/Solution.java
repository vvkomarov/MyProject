package level07.lesson06.task02;

/* 5 строчек: «101», «102», «103», «104», «105»

1. Создай список строк.

2. Добавь в него 5 строчек: «101», «102», «103», «104», «105».

3. Удали первую, среднюю и последнюю.

4. Используя цикл выведи на экран его содержимое, каждое значение с новой строки.

5. Выведи его размер. (После удаления одного элемента индексы остальных меняются.

Например, если удалить 0-й элемент, то тот, который был 1-м, станет 0-м. И т.д.)

*/

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            list.add("10" + i);
        }
        list.remove(0);
        list.remove(1);
        list.remove(2);
        for (String b : list) {
            System.out.println(b);
        }
        System.out.println("Размер " + list.size());
    }

}