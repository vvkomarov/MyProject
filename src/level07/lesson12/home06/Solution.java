package level07.lesson12.home06;

/* Семья

Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:

Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:

Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя

Имя: Катя, пол: женский, возраст: 55

Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня

…

*/

public class Solution {

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public void getHuman() {
            if (father == null && mother == null) {
                if (sex == true) {
                    System.out.println("Имя : " + name + " ,пол: мужской " + ", возраст: " + age);
                } else {
                    System.out.println("Имя : " + name + " ,пол: женский " + ", возраст: " + age);
                }
            } else if (sex == true) {
                System.out.println("Имя : " + name + " ,пол: мужской " + ", возраст: " + age + " , отец : " + father.name + " , мать : " + mother.name);
            } else {
                System.out.println("Имя : " + name + " ,пол: женский " + ", возраст: " + age + " , отец : " + father.name + " , мать : " + mother.name);
            }
        }

        public String toString() {
            String text = "";
            text += "Имя: " + name;
            text += " пол: " + (sex ? "мужской" : "женский");
            text += " возраст: " + age;
            if (father != null) {
                text += " отец: " + father.name;
            }
            if (mother != null) {
                text += " мать: " + mother.name;
            }
            return text;
        }
    }

    public static void main(String[] args) {
        Human grandfather = new Human("Дедушка Олег", true, 70);
        Human grandmother = new Human("Бабушка Валентина", false, 67);
        Human batya = new Human("Папа Вова", true, 41, grandfather, grandmother);
        Human grandfather1 = new Human("Дедушка Иван", true, 69);
        Human grandmother1 = new Human("Бабушка Александра", false, 68);
        Human maman = new Human("Мама Наташа", false, 37, grandfather1, grandmother1);
        Human pizdyk1 = new Human("Коля", true, 10, batya, maman);
        Human pizdyk2 = new Human("Вася", true, 8, batya, maman);
        Human pizdyk3 = new Human("Нина", false, 5, batya, maman);
        grandfather.getHuman();
        grandmother.getHuman();
        grandfather1.getHuman();
        grandmother1.getHuman();
        System.out.println(batya.toString());
        System.out.println(maman.toString());
        pizdyk1.getHuman();
        pizdyk2.getHuman();
        pizdyk3.getHuman();
    }

}
