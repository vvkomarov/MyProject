package level12.lesson02.task04;

/* Или «Кошка», или «Собака», или «Птица», или «Лампа»

Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: «Кошка», «Собака», «Птица», «Лампа».

*/

class Solution {

    public static void main(String[] args) {

        printObjectType(new Cat());

        printObjectType(new Bird());

        printObjectType(new Lamp());

        printObjectType(new Cat());

        printObjectType(new Dog());
    }

    public static void printObjectType(Object k) {
        if (k instanceof Cat) {
            System.out.println("Кот");
        } else if (k instanceof Bird) {
            System.out.println("Птица");
        } else if (k instanceof Lamp) {
            System.out.println("Лампа");
        } else if (k instanceof Dog) {
            System.out.println("Собака");
        }
    }

    static class Cat {

    }

    static class Dog {
    }

    private static class Bird {
    }

    private static class Lamp {
    }
}