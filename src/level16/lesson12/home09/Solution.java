package level16.lesson12.home09;

/* Только по-очереди!
1. В классе Solution создать нить public static Read3Strings унаследовавшись от Thread.
2. В методе run реализовать чтение с консоли трех строк.
3. Три подряд введенных строки должны считываться в одной нити и объединяться в одну строку через пробел.
4. В методе main вывести результат для каждой нити.
5. Используйте join

Пример:
Входные данные
a
b
c
d
e
f
Выходные данные:
a b c
d e f
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        try {
            t1.join();
            t2.join();
            reader.close();
            System.out.println(t1.getResult());
            System.out.println(t2.getResult());
        } catch (InterruptedException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static class Read3Strings extends Thread {

        String result = "";

        Read3Strings() {
            start();
        }

        @Override
        public void run() {
            for (int j = 0; j < 3; j++) {
                try {
                    result += reader.readLine() + " ";
                } catch (IOException e) {
                    e.getStackTrace();
                }
            }
        }

        public String getResult() {
            return result;
        }

        @Override
        public String toString() {
            return getName() + " " + result;
        }
    }

}