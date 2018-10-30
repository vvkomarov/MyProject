package level15.lesson12.home10;

/* ООП - наследование
Исправить класс Hrivna так, чтоб избежать ошибку StackOverflowError, класс Money менять нельзя.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Hrivna().getAmount());
    }

    static abstract class Money {
        abstract Money getMoney();

        Object getAmount() {
            return getMoney().getAmount();
        }
    }

    public static class Hrivna extends Money {

        public double amount = 123d;

        @Override
        Money getMoney() {
            return null;
        }

        @Override
        Object getAmount() {
            return amount;
        }
    }

}