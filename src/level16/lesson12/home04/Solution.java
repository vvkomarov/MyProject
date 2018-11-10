package level16.lesson12.home04;

/* Последовательные выполнения нитей
1. Разберись, что делает программа.
2. Сделай так, чтоб программа сначала выводила результат нити, а когда нить завершится - продолжила метод main.
3. Пример выходных данных:
inside MyThread 0
inside MyThread 1
...
inside MyThread 9
inside main 0
inside main 1
...
inside main 9
*/

public class Solution {

    public static MyThread t = new MyThread();
    static String message = "inside main ";

    public static void main(String[] args) throws InterruptedException {
        t.start();
        t.join();
        for (int i = 0; i < 10; i++) {
            System.out.println(message + i);
            sleep();
        }
    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            for (int j = 0; j < 10; j++) {
                System.out.println("inside MyThread " + j);
                Solution.sleep();
            }
        }
    }

    public static void sleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }
}