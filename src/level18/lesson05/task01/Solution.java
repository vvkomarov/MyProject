package level18.lesson05.task01;

/* Исправить ошибки
Исправить функциональность в соответствии с требованиями
Программа должна:
1. переписать все байты одного файла в другой одним куском.
2. закрывать потоки ввода-вывода
Подсказка: 4 ошибки
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Solution {

    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("C:/Users/Admin/IdeaProjects/MyProject/src/level18/lesson05/task01/text.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/Admin/IdeaProjects/MyProject/src/level18/lesson05/task01/result.txt");
        while (fileInputStream.available() > 0) {
            //читаем весь файл одним куском
            byte buffer[] = new byte[fileInputStream.available()];
            int count = fileInputStream.read(buffer);
            fileOutputStream.write(buffer, 0, count);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

}