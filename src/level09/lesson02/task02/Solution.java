package level09.lesson02.task02;

/* И снова StackTrace

Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.

*/

class Solution {

    public static void main(String[] args) {
        method1();
    }

    private static String method1() {
        method2();
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " возвращает " + Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    private static String method2() {
        method3();
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " возвращает " + Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    private static String method3() {
        method4();
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " возвращает " + Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    private static String method4() {
        method5();
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " возвращает " + Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    private static String method5() {
        System.out.println("Нулевой элемент " + Thread.currentThread().getStackTrace()[0].getMethodName());
        System.out.println("Первый элемент " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " возвращает " + Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}