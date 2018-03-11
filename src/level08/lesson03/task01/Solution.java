package level08.lesson03.task01;

/* HashSet из растений

Создать коллекцию HashSet с типом элементов String.

Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.

Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Посмотреть, как изменился порядок добавленных элементов.

*/

import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();
        hash.add("Арбуз");
        hash.add("Банан");
        hash.add("Вишня");
        hash.add("Груша");
        hash.add("Дыня");
        hash.add("Ежевика");
        hash.add("Жень-шень");
        hash.add("Земляника");
        hash.add("Ирис");
        hash.add("Картофель");
        for (String b : hash) {
            System.out.println(b);
        }
    }

}