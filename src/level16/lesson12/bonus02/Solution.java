package level16.lesson12.bonus02;

/* Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
Подсказка: Нить 4 можно проверить методом isAlive()
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    static List<Thread> threads = new ArrayList<>();

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();
        Thread2 thread2 = new Thread2();
        thread2.start();
        thread2.interrupt();
        Thread3 thread3 = new Thread3();
        thread3.start();
        Thread4 thread4 = new Thread4();
        thread4.start();
        thread4.showWarning();
        Thread5 thread5 = new Thread5();
        thread5.start();
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()) {

            }
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            try {
                System.out.println("Ура");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.getMessage();
                System.out.println(getName() + " завершён");
            }
        }
    }

    public static class Thread4 extends Thread implements Message {

        @Override
        public void showWarning() {
            interrupt();
        }

        @Override
        public void run() {
            while (!isInterrupted()) {
                System.out.println("Поток 4 выполняется");
            }
        }
    }

    public static class Thread5 extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        @Override
        public void run() {
            int k = 0;
            try {
                while (!isInterrupted()) {
                    String a = reader.readLine();
                    if (a.equals("N")) {
                        break;
                    } else {
                        try {
                            k += Integer.parseInt(a);
                        } catch (Exception e) {
                            break;
                        }
                    }
                }
                reader.close();
                System.out.println(k);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }
}