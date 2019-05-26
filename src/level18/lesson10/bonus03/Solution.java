package level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)
В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины
Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/


import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        switch (args[0].toString()) {
            case "-u":
                ArrayList<String> result = findAndUpdateByID(fileName, args);
                FileOutputStream fileOutputStream = new FileOutputStream(fileName);
                if (result.size() > 0) {
                    for (int j = 0; j < result.size(); j++) {
                        fileOutputStream.write((result.get(j) + "\r\n").getBytes());
                    }
                }
            case "-d":
        }
    }

    public static ArrayList<String> findAndUpdateByID(String fileName, String[] arguments) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        String str;
        while ((str = reader.readLine()) != null) {
            list.add(str);
        }

        int index = arguments.length - 2;
        String productName = "";
        for (int j = 2; j < index; j++) {
            productName += arguments[j] + " ";
        }

        for (int j = 0; j < list.size(); j++) {
            if (arguments[1].equals(list.get(j).split(" ")[0])) {
                list.set(j, String.format("%-8s%-30s%-8s%-4s", arguments[1], productName, arguments[index], arguments[index + 1]));
            }
        }
        return list;
    }
}