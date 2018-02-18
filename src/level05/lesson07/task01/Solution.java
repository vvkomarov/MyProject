package level05.lesson07.task01;

/* Создать класс Friend

Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):

- Имя

- Имя, возраст

- Имя, возраст, пол

*/
public class Solution {
    public static class Friend {
        String name;
        int age;
        boolean sex;

        public void initialization(String name) {
            this.name = name;
        }

        public void initialization(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void initialization(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }

    public static void main(String[] args) {
        Friend Anton = new Friend();
        Anton.initialization("Антон");
        Friend Vasya = new Friend();
        Vasya.initialization("Vasya", 20);
        Friend Borya = new Friend();
        Borya.initialization("Borya", 20, true);
        System.out.println(Anton.name + " " + Anton.age + " " + Anton.sex);
        System.out.println(Vasya.name + " " + Vasya.age + " " + Vasya.sex);
        System.out.println(Borya.name + " " + Borya.age + " " + Borya.sex);
    }

}
