package level12.lesson02.task02;

/* Ничего не выводится на экран
Переопределить метод getName в классе Whale(Кит), чтобы программа ничего не выдавала на экран.
*/

public class Solution {

    public static void main(String[] args) {
        Whale whale = new Whale();
        whale.getName();
    }

    static class Cow {
        String getName() {
            return "Я - корова";
        }
    }

    static class Whale extends Cow {
        String getName() {
            return null;
        }
    }

}
