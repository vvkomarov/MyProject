package level09.lesson02.task01;

/* Каждый метод должен возвращать свой StackTrace

Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.

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
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : elements) {
            System.out.println(element.getMethodName());
        }
        return Thread.currentThread().getStackTrace();
    }

}