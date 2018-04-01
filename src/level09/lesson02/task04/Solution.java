package level09.lesson02.task04;

/* Стек-трейс длиной 10 вызовов

Напиши код, чтобы получить стек-трейс длиной 10 вызовов.

*/

class Solution {

    public static void main(String[] args) {
        method1();
    }

    private static StackTraceElement[] method1() {
        method2();
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] method2() {
        method3();
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] method3() {
        method4();
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] method4() {
        method5();
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] method5() {
        method6();
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] method6() {
        method7();
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] method7() {
        method8();
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] method8() {
        method9();
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] method9() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : elements) {
            System.out.println(element.getMethodName() + " " + element.getLineNumber());
        }
        return Thread.currentThread().getStackTrace();
    }

}