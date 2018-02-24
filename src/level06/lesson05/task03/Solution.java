package level06.lesson05.task03;

/* 10 000 объектов Cat и Dog

Создать в цикле 100 000 объектов Cat и Dog. (Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).

*/

public class Solution {

    public static class Cat {

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Конец котику");
        }
    }

    public static class Dog {

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Посмотри в собаке");
        }
    }

    public static void main(String[] args) throws Throwable {

        for (int z = 0; z <= 100000; z++) {
            Cat cat = new Cat();
            cat.finalize();
            Dog dog = new Dog();
            dog.finalize();
        }

    }

}