package level18.lesson08.task03;

/* AmigoOutputStream
1 Измените класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используйте наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 вызвать метод flush()
2.2 дописать следующий текст [JavaRush © 2012-2013 All rights reserved.], используйте метод getBytes()
2.3 закрыть поток методом close()
*/

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/Users/Admin/Downloads/result.txt";
    private FileOutputStream original;

    public AmigoOutputStream(FileOutputStream stream) throws FileNotFoundException {
        super(fileName);
        this.original = stream;
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        original.write(b, off, len);
    }

    @Override
    public void write(byte[] b) throws IOException {
        original.write(b);
    }

    @Override
    public void write(int b) throws IOException {
        original.write(b);
    }

    @Override
    public void flush() throws IOException {
        original.flush();
    }

    public void close() throws IOException {
        this.flush();
        original.write("JavaRush © 2012-2013 All rights reserved".getBytes());
        original.close();
    }

    public static void main(String[] args) throws Exception

    {
        new AmigoOutputStream(new FileOutputStream(fileName)).close();
    }
}
