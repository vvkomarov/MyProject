package level09.lesson02.task03;

/* Метод должен вернуть номер строки кода, из которого вызвали этот метод

Написать пять методов, которые вызывают друг друга. Метод должен вернуть номер строки кода, из которого вызвали этот метод. Воспользуйся функцией: element.getLineNumber().

*/
class Solution {

    public static void main(String[] args) {
        method1();
    }

    private static Integer method1() {
        method2();
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " возвращает " + Thread.currentThread().getStackTrace()[2].getLineNumber());
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    private static Integer method2() {
        method3();
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " возвращает " + Thread.currentThread().getStackTrace()[2].getLineNumber());
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    private static Integer method3() {
        method4();
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " возвращает " + Thread.currentThread().getStackTrace()[2].getLineNumber());
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    private static Integer method4() {
        method5();
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " возвращает " + Thread.currentThread().getStackTrace()[2].getLineNumber());
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    private static Integer method5() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " возвращает " + Thread.currentThread().getStackTrace()[2].getLineNumber());
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}