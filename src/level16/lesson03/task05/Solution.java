package level16.lesson03.task05;

/* Поговорим о музыке?
1. Измените класс Violin так, чтоб он стал таском для нити. Используйте интерфейс MusicalInstrument
2. Реализуй необходимый метод в нити Violin. Реализация должна быть следующей:
2.1. Считай время начала игры - метод startPlaying().
2.2. Подожди 1 секунду - метод sleepNSeconds(int n), где n - количество секунд.
2.3. Считай время окончания игры - метод stopPlaying().
2.4. Выведи на консоль продолжительность игры в миллисекундах. Пример "Playing 1002 ms".
*/

import java.util.Date;

public class Solution {

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }

    public static class Violin implements MusicalInstrument {

        public String name;

        public Violin(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                Date date1 = startPlaying();
                sleepNSeconds(1);
                Date date2 = stopPlaying();
                System.out.println("Playing " + (date2.getTime() - date1.getTime()) + " ms");
            } catch (Exception e) {
                e.getMessage();
            }
        }

        @Override
        public Date startPlaying() {
            System.out.println(this.name + " starts playing");
            return new Date();
        }

        public void sleepNSeconds(int n) throws InterruptedException {
            Thread.sleep(n * 10);
        }

        @Override
        public Date stopPlaying() {
            System.out.println(this.name + " stops playing");
            return new Date();
        }
    }

    public static interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }

}
