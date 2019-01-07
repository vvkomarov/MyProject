package level17.lesson10.home03;

/* Аптека
Реализуй интерфейс Runnable в класах Apteka и Person.
Все нити должны работать пока не isStopped
Логика для Apteka: drugsController должен сделать закупку случайного лекарства (getRandomDrug) в количестве (getRandomCount) и подождать 300 мс
Логика для Person: drugsController должен сделать продажу случайного лекарства (getRandomDrug) в количестве (getRandomCount) и подождать 100 мс
Расставь synchronized там, где это необходимо
*/

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Solution {
    private final static DrugsController drugsController = new DrugsController();
    private static boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Thread apteka = new Thread(new Apteka());
        Thread man = new Thread(new Person(), "Мужчина");
        Thread woman = new Thread(new Person(), "Женщина");

        apteka.start();
        man.start();
        woman.start();
        TimeUnit.MILLISECONDS.sleep(1000);
        isStopped = true;
    }

    private static int getRandomCount() {
        return (int) (Math.random() * 3) + 1;
    }

    private static Drug getRandomDrug() {
        int index = (int) ((Math.random() * 1000) % (DrugsController.allDrugs.size()));
        List<Drug> drugs = new ArrayList<>(DrugsController.allDrugs.keySet());
        return drugs.get(index);
    }

    private static void waitAMoment() {
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException ignored) {
        }
    }

    static class Apteka implements Runnable {
        public void run() {
            while (!isStopped) {
                drugsController.buy(getRandomDrug(), getRandomCount());
                try {
                    Thread.sleep(300);
                } catch (Exception ignor) {

                }
            }
        }
    }

    static class Person implements Runnable {
        public void run() {
            while (!isStopped) {
                drugsController.sell(getRandomDrug(), getRandomCount());
                try {
                    Thread.sleep(100);
                } catch (Exception ignor) {

                }
            }
        }
    }
}
