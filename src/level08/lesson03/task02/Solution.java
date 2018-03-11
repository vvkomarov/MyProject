package level08.lesson03.task02;

/* HashMap из 10 пар

Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:

арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.

Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):

картофель – овощ

*/

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Арбуз", "Ягода");
        map.put("Банан", "Трава");
        map.put("Вишня", "Ягода");
        map.put("Груша", "Фрукт");
        map.put("Дыня", "Овощ");
        map.put("Ежевика", "Куст");
        map.put("Жень-шень", "Корень");
        map.put("Земляника", "Ягода");
        map.put("Ирис", "Цветок");
        map.put("Картофель", "Клубень");
        for (HashMap.Entry<String, String> b : map.entrySet()) {
            String value = b.getValue();
            String key = b.getKey();
            System.out.println(value + " " + key);
        }
    }

}