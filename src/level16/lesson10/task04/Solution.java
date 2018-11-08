package level16.lesson10.task04;

/* А без interrupt слабо?
Разберись, как работает программа.
Сделай так, чтобы в методе ourInterruptMethod можно было сделать так, чтобы нить TestThread завершилась сама.
Нельзя использовать метод interrupt.
*/

public class Solution {

    public static void main(String[] args) {
        Thread thread = new Thread(new TestThread());
        thread.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        ourInterruptMethod();
    }

    private static boolean isRun = true;

    public static void ourInterruptMethod() {
        isRun = false;
    }

    public static class TestThread implements Runnable {
        @Override
        public void run() {
            while (isRun) {
                System.out.println("Run");
            }
        }
    }

}