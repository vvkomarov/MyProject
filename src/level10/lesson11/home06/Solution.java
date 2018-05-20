package level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution {

    public static void main(String[] args) {
        Human human1 = new Human("Вася");
    }

    public static class Human {
        int age;
        String firstname;
        String middlename;
        String lastname;
        boolean sex;
        int weight;

        Human(int age) {
            this.age = age;
        }

        Human(String firstname) {
            this.firstname = firstname;
        }

        Human(String firstname, String middlename) {
            this.firstname = firstname;
            this.middlename = middlename;
        }

        Human(String firstname, String middlename, String lastname) {
            this.firstname = firstname;
            this.middlename = middlename;
            this.lastname = lastname;
        }

        Human(String firstname, int age) {
            this.firstname = firstname;
            this.age = age;
        }

        Human(int age, boolean sex) {
            this.age = age;
            this.sex = sex;
        }

        Human(String firstname, boolean sex) {
            this.firstname = firstname;
            this.sex = sex;
        }

        Human(String firstname, String middlename, boolean sex) {
            this.firstname = firstname;
            this.middlename = middlename;
            this.sex = sex;
        }

        Human(String firstname, String middlename, String lastname, boolean sex) {
            this.firstname = firstname;
            this.middlename = middlename;
            this.lastname = lastname;
            this.sex = sex;
        }

        Human(String firstname, int age, boolean sex) {
            this.firstname = firstname;
            this.age = age;
            this.sex = sex;
        }
    }

}
