package level18.lesson10.bonus02;
/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
        switch (args[0].toString()) {
            case "-c":
                int indexProduct = 1;
                for (int j = 1; j < args.length; j++) {
                    try {
                        float b = Float.parseFloat(args[j]);
                        indexProduct = j;
                        break;
                    } catch (NumberFormatException e) {
                    }
                }
                String productName = args[1];
                String price = args[indexProduct];
                String count = args[indexProduct + 1];
                int id = checkID(fileName);
                String ident = String.valueOf(id);
                for (int k = 2; k < indexProduct; k++) {
                    productName += " " + args[k];
                }
                String result = String.format("%-8s%-30s%-8s%-4s", id, productName, price, count) + "\r\n";
                fileOutputStream.write(result.getBytes());
        }
    }

    public static int checkID(String fileName) {
        int id = 0;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            String strLine;
            while ((strLine = reader.readLine()) != null) {
                String identify = strLine.split(" ")[0];
                if (id < Integer.parseInt(identify)) {
                    id = Integer.parseInt(identify);
                }
            }
            return ++id;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return id;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return id;
        } catch (IOException e) {
            e.printStackTrace();
            return id;
        }
    }
}