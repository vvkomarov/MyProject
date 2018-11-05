package level16.lesson07.task04;

/* Обратный отсчет
1. Разберись, что делает программа.
2. Реализуй логику метода printCountdown так, чтобы каждые полсекунды выводился объект из
переменной list в обратном порядке - от переданного индекса до нуля.
Пример: Передан индекс 3
Пример вывода в консоль:
Строка 2
Строка 1
Строка 0
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static volatile List<String> list = new ArrayList<String>(5);

    static {
        for (int i = 0; i < 5; i++) {
            list.add("Строка " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Countdown(3));
        t.start();
    }

    public static class Countdown implements Runnable {
        private int countFrom;

        public Countdown(int countFrom) {
            this.countFrom = countFrom;
        }

        public void run() {
            try {
                while (countFrom > 0) {
                    printCountdown();
                }
            } catch (InterruptedException e) {
            }
        }

        public void printCountdown() throws InterruptedException {
            Thread.sleep(500);
            System.out.println(list.get(countFrom - 1));
            countFrom--;
        }
    }
}
