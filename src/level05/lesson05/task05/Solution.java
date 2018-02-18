package level05.lesson05.task05;

/* Провести три боя  попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/
public class Solution {
    public static final class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getStrength() {
            return strength;
        }

        public void setStrength(int strength) {
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;
            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; //эквивалентно return score > 2 ? true : false;
        }

        public Cat(String name, int age, int weight, int strength) {
            Cat cat = this;
            cat.name = name;
            cat.age = age;
            cat.weight = weight;
            cat.strength = strength;
        }
    }

    public static void main(String[] args) {
        Cat Vaska = new Cat(null, 0, 0, 0);
        Cat Boris = new Cat(null, 0, 0, 0);
        Cat Ivan = new Cat(null, 0, 0, 0);
        Vaska.setName("Vaska");
        Vaska.setAge(5);
        Vaska.setWeight(5);
        Vaska.setStrength(10);
        Boris.setName("Boris");
        Boris.setAge(7);
        Boris.setWeight(7);
        Boris.setWeight(12);
        Ivan.setName("Иван");
        Ivan.setAge(5);
        Ivan.setWeight(10);
        Ivan.setStrength(15);
        System.out.println("Борис против Васьки " + Boris.fight(Vaska));
        System.out.println("Борис против Ивана " + Boris.fight(Ivan));
        System.out.println("Иван против Васьки " + Boris.fight(Vaska));
    }
}