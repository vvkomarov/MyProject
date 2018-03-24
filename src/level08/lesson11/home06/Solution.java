package level08.lesson11.home06;

/* Вся семья в сборе

1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).

2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.

3. Вывести все объекты Human на экран.

*/

import java.util.ArrayList;

public class Solution {

    static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> child;

        Human(String name, boolean sex, int age, ArrayList<Human> child) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.child = child;
        }

        public String printPeople() {
            String result = "Имя:" + this.name;
            result += " Пол:";
            if (this.sex == true) {
                result += "Мужской";
            } else {
                result += "Женский";
            }
            result += " Возраст:" + this.age;
            if (child.size() > 0) {
                result += " Дети:";
                for (int j = 0; j < child.size(); j++) {
                    result += child.get(j).name + ", ";
                }
            }
            return result;
        }

        public String toString() {
            StringBuilder text = new StringBuilder();
            text.append("Имя: ").append(this.name);
            text.append(", пол: ").append(this.sex ? "мужской" : "женский");
            text.append(", возраст: ").append(this.age);
            int childCount = this.child.size();
            if (childCount > 0) {
                text.append(", дети: ").append(this.child.get(0).name);
                for (int i = 1; i < childCount; i++) {
                    Human child = this.child.get(i);
                    text.append(", ").append(child.name);
                }
            }
            return text.toString();
        }
    }

    public static void main(String[] args) {
        ArrayList<Human> emptyList = new ArrayList<>();
        Human child1 = new Human("Сын Петя", true, 10, emptyList);
        Human child2 = new Human("Сын Коля", true, 10, emptyList);
        Human child3 = new Human("Дочь Василиса", false, 8, emptyList);
        ArrayList<Human> childList = new ArrayList<>();
        childList.add(child1);
        childList.add(child2);
        childList.add(child3);
        Human father = new Human("Папа Коля", true, 35, childList);
        Human mother = new Human("Мама Нина", false, 30, childList);
        ArrayList<Human> list1 = new ArrayList<>();
        list1.add(father);
        ArrayList<Human> list2 = new ArrayList<>();
        list2.add(mother);
        Human grandfather1 = new Human("Дедушка Вася", true, 65, list1);
        Human grandfather2 = new Human("Дедушка Витя", true, 69, list1);
        Human grandmother1 = new Human("Бабушка Нина", false, 60, list2);
        Human grandmother2 = new Human("Бабушка Катя", false, 62, list2);
        System.out.println(child1.printPeople());
        System.out.println(child2.printPeople());
        System.out.println(child3.printPeople());
        System.out.println(father.printPeople());
        System.out.println(mother.printPeople());
        System.out.println(grandfather1.printPeople());
        System.out.println(grandmother1.printPeople());
        System.out.println(grandfather2.printPeople());
        System.out.println(grandmother2.toString());
    }

}