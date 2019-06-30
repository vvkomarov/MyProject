package level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader1 = new FileReader(reader.readLine());
        FileWriter writer = new FileWriter(reader.readLine());
        reader.close();
        while (reader1.ready()) {
            reader1.skip(1);
            int data = reader1.read();
            writer.write(data);
        }
        reader1.close();
        writer.close();
    }
}
