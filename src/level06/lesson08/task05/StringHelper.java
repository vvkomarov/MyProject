package level06.lesson08.task05;

/* Класс StringHelper

        Cделать класс StringHelper, у которого будут 2 статических метода:

        String multiply(String s, int count) – возвращает строку повторенную count раз.

        String multiply(String s) – возвращает строку повторенную 5 раз.

        Пример:

        Амиго -> АмигоАмигоАмигоАмигоАмиго

        */

public class StringHelper {

    public static String multiply(String s, int count) {
        String result = "";
        for (int z = 0; z < count; z++) {
            result = result + s;
        }
        return result;
    }

    public static String multiply(String s) {
        String result = "";
        for (int z = 0; z < 5; z++) {
            result = result + s;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(StringHelper.multiply("Строка выведенная 2 раза", 2));
        System.out.println(StringHelper.multiply("Строка выведенная 5 раза"));
    }

}