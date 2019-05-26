package level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
-e C:\Users\Admin\Downloads\test.txt C:\Users\Admin\Downloads\result.txt
-d C:\Users\Admin\Downloads\result.txt C:\Users\Admin\Downloads\result2.txt
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    private final static int key = 10;

    public static void main(String[] args) throws IOException {
        if (args.length < 3) return;
        String fileName = args[1];
        String fileOutputName = args[2];
        FileInputStream fileInputStream = new FileInputStream(fileName);
        FileOutputStream fileoutputStream = new FileOutputStream(fileOutputName);
        switch (args[0].toString()) {
            case "-e":
                while (fileInputStream.available() > 0) {
                    int k = fileInputStream.read() + key;
                    fileoutputStream.write(k);
                }
            case "-d":
                while (fileInputStream.available() > 0) {
                    int k = fileInputStream.read() - key;
                    fileoutputStream.write(k);
                }
        }
        fileInputStream.close();
        fileoutputStream.close();
    }
}
