package level23.lesson08.task01;

/*
Напряги извилины!
Метод printName должен выводить свое собственное имя, т.е. «sout»
Сделайте минимум изменений.
Требования:
1. Вывод на экран должен соответствовать условию.
2. В классе Solution должен присутствовать метод sout без параметров.
3. В классе Solution должно присутствовать поле name.
4. Модификатор доступа метода getName должен быть расширен.
*/

public class Solution {
    private final String name;

    private Solution(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        new Solution("main").sout();
    }

    public String getName() {
        return name;
    }

    private void sout() {
        new Solution("sout") {
            void printName() {
                System.out.println(getName());
            }
        }.printName();
    }
}