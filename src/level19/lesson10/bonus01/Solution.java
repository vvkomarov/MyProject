package level19.lesson10.bonus01;

/* Отслеживаем изменения
Считать в консоли 2 имени файла - file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME
Пример:
[Файл 1]
строка1
строка2
строка3
[Файл 2]
строка1
строка3
строка4
[Результат - список lines]
SAME строка1
REMOVED строка2
SAME строка3
ADDED строка4
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static final List<LineItem> lines = new ArrayList<>();
    private static final List<String> file1Lines = new ArrayList<>();
    private static final List<String> file2Lines = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        BufferedReader fileReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        String str = "";
        reader.close();
        while ((str = fileReader1.readLine()) != null) {
            file1Lines.add(str);
        }
        fileReader1.close();

        while ((str = fileReader2.readLine()) != null) {
            file2Lines.add(str);
        }
        fileReader2.close();
        if (!file1Lines.isEmpty() & !file2Lines.isEmpty()) {
            int maxSize;
            if (file1Lines.size() < file2Lines.size()) {
                maxSize = file2Lines.size();
            } else {
                maxSize = file1Lines.size();
            }
            for (int j = 0; j < maxSize; j++) {
                try {
                    if (file1Lines.get(j).equals(file2Lines.get(j))) {
                        lines.add(new LineItem(Type.SAME, file1Lines.get(j)));
                    } else if (file1Lines.get(j).equals(file2Lines.get(j + 1))) {
                        lines.add(new LineItem(Type.ADDED, file2Lines.get(j)));
                        lines.add(new LineItem(Type.SAME, file1Lines.get(j)));
                    } else {
                        lines.add(new LineItem(Type.REMOVED, file1Lines.get(j)));
                    }
                } catch (IndexOutOfBoundsException e) {
                    if (file1Lines.size() > file2Lines.size()) {
                        lines.add(new LineItem(Type.REMOVED, file1Lines.get(j)));
                    } else {
                        lines.add(new LineItem(Type.ADDED, file2Lines.get(j)));
                    }
                }
            }
        } else if (file1Lines.isEmpty() & !file2Lines.isEmpty()) {
            for (int j = 0; j < file2Lines.size(); j++) {
                lines.add(new LineItem(Type.ADDED, file2Lines.get(j)));
            }
        } else if (!file1Lines.isEmpty() & file2Lines.isEmpty()) {
            for (int j = 0; j < file1Lines.size(); j++) {
                lines.add(new LineItem(Type.REMOVED, file1Lines.get(j)));
            }
        }

        for (
                LineItem line : lines)

        {
            System.out.printf("%s %s%n", line.type, line.line);
        }
    }

    public enum Type {
        ADDED,        //added new line
        REMOVED,      //removed line
        SAME          //no changes
    }

    static class LineItem {

        final Type type;
        final String line;

        LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }

}
