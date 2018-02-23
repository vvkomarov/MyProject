package level05.lesson09.task02;

/* Создать класс Cat

Создать класс Cat (кот) с пятью конструкторами:

- Имя,

- Имя, вес, возраст

- Имя, возраст (вес стандартный)

- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)

- вес, цвет, адрес ( чужой домашний кот)

Задача инициализатора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.

*/

public class Solution {
    public static class Cat {

        private String name;

        int weight;

        int age;

        String color;

        String address;

        public Cat() {

        }

        public Cat(String name) {
            this.name = name;
            age = 5;
            weight = 5;
        }

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Cat(String address, String color) {
            this.address = address;
            this.color = color;
            age = 5;
            weight = 5;
        }

        public Cat(int age, String address, String color) {
            this.address = address;
            this.color = color;
            this.age = age;
            weight = 5;
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat dog = new Cat("Васька");
    }
}