package level22.lesson13.task02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/*
Смена кодировки
В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать
содержимое первого файла в кодировке UTF-8.
Требования:
1. Программа НЕ должна считывать данные с клавиатуры.
2. Программа НЕ должна выводить данные на экран.
3. Программа должна записывать данные в файл.
4. Содержимое второго файла должно соответствовать содержимому первого файла за исключением кодировки(UTF-8).
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        Charset win1251 = Charset.forName("Windows-1251");
        Charset utf8 = Charset.forName("UTF-8");
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[1]);
        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        String s = new String(buffer, utf8);
        byte[] write = s.getBytes(win1251);
        fileOutputStream.write(write);
        fileInputStream.close();
        fileOutputStream.close();
    }
}
