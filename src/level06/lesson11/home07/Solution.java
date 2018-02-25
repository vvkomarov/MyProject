package level06.lesson11.home07;

/* Три статические переменных name

Создай 3 public статических переменных: String Solution.name, String Cat.name, String Dog.name

*/

public class Solution {

    public static String name = "Имя";

    public static String getName() {
        return name;
    }

    public static class Cat {

        public static String name = "Кот";

        public static String getName() {
            return name;
        }
    }

    public static class Dog {

        public static String name = "Собака";

        public static String getName() {
            return name;
        }
    }

    public static void main(String[] args) {

        System.out.println(Solution.getName());
        System.out.println(Cat.getName());
        System.out.println(Dog.getName());
    }

}
