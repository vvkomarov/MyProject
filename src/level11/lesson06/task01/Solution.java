package level11.lesson06.task01;

/* Лошадь и пегас
Написать два класса: Horse (лошадь) и Pegas (пегас).
Унаследовать пегаса от лошади.
*/

public class Solution {

    public static void main(String[] args) {
        Pegas peg = new Pegas("Васька");
        peg.fly();
        System.out.println("Пегас по имени " + peg.getName());
    }

    public static class Horse {
        String Name;
    }

    public static class Pegas extends Horse {
        Pegas(String Name) {
            this.Name = Name;
        }

        void fly() {
            System.out.println("Пегас " + this.Name);
        }

        public String getName() {
            return this.Name;
        }
    }

}