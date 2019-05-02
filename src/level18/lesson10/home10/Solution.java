package level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> allString = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (!s.equalsIgnoreCase("end")) {
                allString.add(s);
            } else {
                break;
            }
        }
        filterPart(allString);
        assembleTheParts(allString);
    }

    /**
     * Метод фильтруетназвание частей файла в строгую последовательность
     *
     * @param list
     */
    public static void filterPart(ArrayList<String> list) {
        for (int j = 0; j < list.size(); j++) {
            for (int k = j + 1; k < list.size(); k++) {
                if ((list.get(j).compareTo(list.get(k))) > 0) {
                    String temp = list.get(k);
                    list.set(k, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    /**
     * Метод копирует содержимое частей файла в один файл
     *
     * @param list
     */
    public static void assembleTheParts(ArrayList<String> list) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(list.get(0).split(".part")[0]);
        for (int j = 0; j < list.size(); j++) {
            FileInputStream fileInputStream = new FileInputStream(list.get(j));
            while (fileInputStream.available() > 0) {
                int k = fileInputStream.read();
                fileOutputStream.write(k);
            }
        }
        fileOutputStream.close();
    }
}
