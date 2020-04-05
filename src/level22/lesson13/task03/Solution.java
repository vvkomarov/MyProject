package level22.lesson13.task03;

/*
Проверка номера телефона
Метод checkTelNumber должен проверять, является ли аргумент telNumber валидным номером телефона.
Критерии валидности:
1) если номер начинается с ‘+‘, то он содержит 12 цифр
2) если номер начинается с цифры или открывающей скобки, то он содержит 10 цифр
3) может содержать 0-2 знаков ‘—‘, которые не могут идти подряд
4) может содержать 1 пару скобок ‘(‘ и ‘)‘ , причем если она есть, то она расположена левее знаков ‘-‘
5) скобки внутри содержат четко 3 цифры
6) номер не содержит букв
7) номер заканчивается на цифру
Примеры:
+380501234567 - true
+38(050)1234567 - true
+38050123-45-67 - true
050123-4567 - true
+38)050(1234567 - false
+38(050)1-23-45-6-7 - false
050ххх4567 - false
050123456 - false
(0)501234567 - false
Требования:
1. Метод checkTelNumber должен возвращать значение типа boolean.
2. Метод checkTelNumber должен быть публичным.
3. Метод checkTelNumber должен принимать один параметр типа String.
4. Метод checkTelNumber должен корректно проверять валидность номера телефона переданного ему в качестве параметра.
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        HashMap<String, Boolean> phones = new HashMap<>();
        phones.put("+380501234567", true);
        phones.put("+38(050)1234567", true);
        phones.put("+38050123-45-67", true);
        phones.put("050123-4567", true);
        phones.put("+38)050(1234567", false);
        phones.put("+38(050)1-23-45-6-7", false);
        phones.put("050ххх4567", false);
        phones.put("050123456", false);
        phones.put("(0)501234567", false);

        for (Map.Entry<String, Boolean> pair : phones.entrySet()) {
//            System.out.println(pair.getKey());
            if (checkTelNumber(pair.getKey()) != pair.getValue())
                System.out.println("ERROR:Should be:" + pair.getValue() + " checkTelNumber:" + checkTelNumber(pair.getKey()) + " " + pair.getKey());
        }
    }

    public static boolean checkTelNumber(String telNumber) {
        if (telNumber.matches("[-]{3,}")) {
            return false;
        }
        telNumber = telNumber.replaceAll("-", "");
        if (telNumber.matches("[(][\\d]{3}[)]")) {
            telNumber = telNumber.replaceAll("(", "");
            telNumber = telNumber.replaceAll(")", "");
        }
        if (telNumber.isEmpty()) {
            return false;
        }
        if (telNumber.matches("^[+]\\d{12}$")) {
            return true;
        }
        if (telNumber.matches("^\\d{10}$")) {
            return true;
        }
        if (telNumber.matches("^[(]\\d{10}$")) {
            return true;
        }
        return false;
    }
}
