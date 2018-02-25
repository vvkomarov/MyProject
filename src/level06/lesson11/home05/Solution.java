package level06.lesson11.home05;

/* Есть новые идеи? Подумаем...

1. В классе Solution создать public статический класс Idea

2. В классе Idea создать метод public String getDescription(), который будет возвращать любой непустой текст

3. В классе Solution создайте статический метод public void printIdea(Idea idea), который будет выводить

на экран описание идеи - это то, что возвращает метод getDescription

*/

public class Solution {

    public static class Idea {

        String id;

        public Idea(String id) {
            this.id = id;
        }

        public String getDescription() {
            if (id.isEmpty()) {
                return null;
            } else {
                return id;
            }
        }

    }

    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }

    public static void main(String[] args) {

        Idea idea = new Idea("Идея");
        Idea idea2 = new Idea("");
        Solution.printIdea(idea);
        Solution.printIdea(idea2);
    }

}