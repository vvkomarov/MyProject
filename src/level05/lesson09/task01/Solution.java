package level05.lesson09.task01;

/* Создать класс Friend

Создать класс Friend (друг) с тремя конструкторами:

- Имя

- Имя, возраст

- Имя, возраст, пол

*/
public class Solution {

    public static class Friend {
        String name;
        int age;
        int weight;

        public Friend() {

        }

        Friend(String name) {
            this.name = name;
        }

        public Friend(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Friend(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Friend Vasya = new Friend();
        Friend Borya = new Friend("Borya");
        Friend Kolya = new Friend("Kolya", 20);
        Friend Vladimir = new Friend("Vladimir", 20, 80);
    }
}
