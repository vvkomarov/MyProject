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

    public static void main(String[] args) {
        List<Horse> list = new ArrayList<>();
        list.add(new Horse("Василёк", 3, 0));
        list.add(new Horse("Плотва", 3, 0));
        list.add(new Horse("Пингвин", 3, 0));
        game = new Hippodrome(list);
    }

    public void run() throws InterruptedException {
        for (int j = 1; j < 100; j++) {
            move();
            print();
            Thread.sleep(200)
        }
    }

    public void move() {

    }

    public void print() {

    }
}
