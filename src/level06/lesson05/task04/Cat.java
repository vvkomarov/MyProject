package level06.lesson05.task04;

/* Cчётчик котов

В конструкторе класса Cat [public Cat()] увеличивать счётчик котов (статическую переменную этого же класса catCount) на 1. В методе finalize уменьшать на 1.

*/

public class Cat {

    static int CatCount = 0;

    Cat() {
        CatCount++;
    }

    @Override
    protected void finalize() throws Throwable {
        CatCount--;
    }

    public static void main(String[] args) throws Throwable {
        Cat cat = new Cat();
        System.out.println(CatCount);
        cat.finalize();
        System.out.println(CatCount);
    }

}