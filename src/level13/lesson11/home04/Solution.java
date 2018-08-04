package level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = new FileOutputStream(reader.readLine());
        String c;
        while ((c = reader.readLine()) != null) {
            if (c.equals("exit")) {
                break;
            } else {
                c += "\n";
                outputStream.write(c.getBytes());
            }
        }
        BufferedReader getfile = new BufferedReader(new FileReader("C:\\Users\\Admin\\IdeaProjects\\MyProject\\src\\level13\\lesson11\\home04\\text.txt"));
        String result;
        while ((result = getfile.readLine()) != null) {
            System.out.println(result);
        }
        outputStream.close();
    }

}