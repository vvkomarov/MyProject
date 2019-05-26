package level17.lesson10.home09;

/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        readandwrite(reader.readLine(), allLines);
        readandwrite(reader.readLine(), forRemoveLines);
        reader.close();
        joinData();
        for (String result : allLines) {
            System.out.println(result);
        }
    }

    public static void readandwrite(String file, List<String> list) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String str;
        while ((str = reader.readLine()) != null) {
            list.add(str);
        }
        reader.close();
    }

    public static void joinData() throws CorruptedDataException {
        synchronized (allLines) {
            if (allLines.containsAll(forRemoveLines)) {
                allLines.removeAll(forRemoveLines);
            } else if (!allLines.contains(forRemoveLines)) {
                allLines.clear();
                throw new CorruptedDataException();
            }
        }
    }
}