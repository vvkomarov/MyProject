package level05.lesson05.task02;
/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
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
            return anotherCat.getWeight() + anotherCat.getStrength() - anotherCat.getAge() <= this.getWeight() + this.getStrength() - this.getAge();
        }
    }

    public static void main(String[] args) {
        Cat Vaska = new Cat();
        Cat Boris = new Cat();
        Vaska.setName("Vaska");
        Vaska.setAge(5);
        Vaska.setWeight(5);
        Vaska.setStrength(10);
        Boris.setName("Boris");
        Boris.setAge(7);
        Boris.setWeight(7);
        Boris.setWeight(12);
        System.out.println(Boris.fight(Vaska));
    }
}