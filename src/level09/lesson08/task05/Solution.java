package level09.lesson08.task05;

/* Перехват unchecked исключений
        В методе processExceptions обработайте все unchecked исключения.
        Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
        Можно использовать только один блок try..
        */

public class Solution {

    public static void main(String[] args) {
        processExceptions(new Solution());
    }

    public static void processExceptions(Solution obj) {

        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (Error e) {
            printStack();
        }

    }

    public void method1() {
        throw new LinkageError();
    }

    public void method2() {
        throw new OutOfMemoryError();
    }

    public void method3() {
        throw new StackOverflowError();
    }

    public static void printStack() {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        for (StackTraceElement elements : element) {
            System.out.println(elements);
        }
    }

}