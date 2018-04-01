package level09.lesson02.task05;

/* Метод должен возвращать результат – глубину её стек-трейса

Написать метод, который возвращает результат – глубину его стек трейса – количество методов в нем (количество элементов в списке). Это же число метод должен выводить на экран.

*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getCountStackTrace());
    }

    public static int getCountStackTrace() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements.length;
    }

}