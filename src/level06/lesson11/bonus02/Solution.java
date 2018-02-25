package level06.lesson11.bonus02;

/* Нужно добавить в программу новую функциональность

Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.

Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.

Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).

Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.



Пример ввода:

дедушка Вася

бабушка Мурка

папа Котофей

мама Василиса

сын Мурчик

дочь Пушинка



Пример вывода:

Cat name is дедушка Вася, no mother, no father

Cat name is бабушка Мурка, no mother, no father

Cat name is папа Котофей, no mother, father is дедушка Вася

Cat name is мама Василиса, mother is бабушка Мурка, no father

Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей

Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static class Cat {

        public String name;
        public Cat mother;
        public Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) {

            this.name = name;

            this.mother = mother;

            this.father = father;

        }

        public String toString() {
            if (father == null && mother == null) {
                return "Cat name is" + name + ", no mother, no father";
            } else if (father == null) {
                return "Cat name is" + name + ", mother is" + mother.name + ", no father";
            } else if (mother == null) {
                return "Cat name is" + name + ", no mother,father is" + father.name;
            } else return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Cat grfather = new Cat(bf.readLine());
        Cat grmother = new Cat(bf.readLine());
        Cat father = new Cat(bf.readLine(), grfather, null);
        Cat mother = new Cat(bf.readLine(), null, grmother);
        Cat sun = new Cat(bf.readLine(), father, mother);
        Cat daughter = new Cat(bf.readLine(), father, mother);
        System.out.println(grfather.toString());
        System.out.println(grmother.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(sun.toString());
        System.out.println(daughter.toString());
    }

}