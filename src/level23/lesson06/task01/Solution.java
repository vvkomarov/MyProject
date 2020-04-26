package level23.lesson06.task01;

/* Как выбрать нужное?
В методе main присвойте объекту Object obj экземпляр класса TEST
Константу TEST и класс TEST менять нельзя.
*/

public class Solution {
    public static final String TEST = "test";
    @SuppressWarnings("FieldCanBeLocal")
    private static Object obj;

    public static void main(String[] args) {
        obj = new TEST();
    }

    static class TEST {

        @Override
        public String toString() {
            return "test class";
        }
    }
}
