package level19.lesson10.bonus02;

/* Свой FileWriter
Реализовать логику FileConsoleWriter.
Класс FileConsoleWriter должен содержать приватное поле FileWriter fileWriter.
Класс FileConsoleWriter должен содержать все конструкторы, которые инициализируют fileWriter для записи.
При записи данных в файл, должен дублировать эти данные на консоль.
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {

    private FileWriter fileWriter = null;

    public static void main(String[] args) {

    }

    public FileConsoleWriter(String fileName) throws IOException {
        fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        fileWriter = new FileWriter(fileName, append);
    }

    public FileConsoleWriter(File file) throws IOException {
        fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(FileDescriptor fd) {
        fileWriter = new FileWriter(fd);
    }


    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println(c);
    }


    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        for (int i = off; i < off + len; i++) {
            System.out.print(cbuf[i]);
        }
    }

    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        System.out.println(str.substring(off, len + off));
    }

    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        for (int j = 0; j < cbuf.length; j++) {
            System.out.println(cbuf[j]);
        }
    }

    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.println(str);
    }
}