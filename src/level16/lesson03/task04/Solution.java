package level16.lesson03.task04;

/* Вывод стек-трейса
1. Создать таск - класс public static SpecialThread - на основании интерфейса Runnable
2. SpecialThread должен выводить в консоль свой стек-трейс.
Подсказка: main thread уже выводит в консоль свой стек-трейс.
*/

public class Solution {

    public static void main(String[] args) {
        new Thread(new SpecialThread()).start();

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
            System.out.println("*****************");
        }
    }

    public static class SpecialThread implements Runnable {
        @Override
        public void run() {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element);
            }
        }
    }

}
