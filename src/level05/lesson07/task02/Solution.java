package level05.lesson07.task02;

/* Создать класс Cat

Создать класс Cat (кот) с пятью инициализаторами:

- Имя,

- Имя, вес, возраст

- Имя, возраст (вес стандартный)

- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)

- вес, цвет, адрес ( чужой домашний кот)

Задача инициализатора – сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.

*/
public class Solution {
    public static class Cat {
        private String name;

        private int age = 1;

        private int weight = 10;

        private String address;

        private String colour;

        public void initialization(String name) {
            this.name = name;
            age = 5;
            weight = 5;
        }

        public void initialization(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public void initialization(String name, int age) {
            this.name = name;
            this.age = age;
            weight = 5;
        }

        public void initialization(String address, String colour) {
            this.address = address;
            this.colour = colour;
            age = 5;
            weight = 5;
        }

        public void initialization(int age, String colour, String address) {
            this.age = age;
            this.colour = colour;
            this.address = address;
            weight = 5;
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.initialization("Васька");
        System.out.println(cat.name + " " + cat.age + " " + cat.weight + " " + cat.address + " " + cat.colour);
    }

}
