package level12.lesson02.task01;

/* Я не корова, Я - кит.
Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала:
Я не корова, Я - кит.
*/

public class Solution {

    public static void main(String[] args) {
        Whale whale = new Whale();
        whale.getName();
    }

    public static class Cow {
        void getName() {
            System.out.println("Я корова");
        }
    }

    public static class Whale extends Cow {
        void getName() {
            System.out.println("Я не корова, Я - кит");
        }
    }

}
