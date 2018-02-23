package level05.lesson12.home01;

/* Три класса

По аналогии с классом Duck(утка) создай классы Cat(кошка) и Dog(собака).

Подумай, что должен возвращать метод toString в классах Cat и Dog?

В методе main создай по два объекта каждого класса и выведите их на экран.

Объекты класса Duck уже созданы и выводятся на экран.

*/
public class Solution {
    public static class Duck

    {

        public String toString() {

            return "Duck";

        }

    }

    public static class Cat {

        public String toString() {

            return "Cat";

        }

    }

    public static class Dog {

        public String toString() {

            return "Dog";

        }

    }

    public static void main(String[] args) {

        Duck duck = new Duck();
        Cat cat = new Cat();
        Dog dog = new Dog();
        System.out.println(duck.toString());
        System.out.println(cat.toString());
        System.out.println(dog.toString());
    }
}