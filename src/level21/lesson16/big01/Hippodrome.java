package level21.lesson16.big01;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;

    public static Hippodrome game;

    public Hippodrome(List<Horse> list) {
        this.horses = list;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) throws InterruptedException {
        List<Horse> list = new ArrayList<>();
        list.add(new Horse("Василёк", 4, 0));
        list.add(new Horse("Плотва", 5, 0));
        list.add(new Horse("Пингвин", 4, 0));
        game = new Hippodrome(list);
        game.run();
        game.printWinner();
    }

    public void run() throws InterruptedException {
        for (int j = 1; j < 10; j++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        horses.forEach(Horse::move);
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
            System.out.println();
            System.out.println();
        }
    }

    public Horse getWinner() {
        Horse horse = game.horses.get(0);
        for (Horse horses : game.getHorses()) {
            if (horses.getDistance() > horse.getDistance()) {
                horse = horses;
            }
        }
        return horse;
    }

    public void printWinner() {
        Horse horse = getWinner();
        System.out.println("Winner is " + horse.getName());
    }
}
