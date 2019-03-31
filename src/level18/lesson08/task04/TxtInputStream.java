package level18.lesson08.task04;

/* UnsupportedFileName
Измените класс TxtInputStream так, чтобы он работал только с txt-файлами (*.txt)
Например, first.txt или name.1.part3.txt
Если передан не txt-файл, например, file.txt.exe, то конструктор должен выбрасывать исключение UnsupportedFileNameException
*/

import java.io.FileInputStream;

public class TxtInputStream extends FileInputStream {
    public TxtInputStream(String filename) throws Exception {
        super(filename);
        if (!filename.endsWith(".txt")) {
            throw new UnsupportedFileNameException();
        }
    }


    public static void main(String[] args) {

    }
}
