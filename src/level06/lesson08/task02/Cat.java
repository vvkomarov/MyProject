package level06.lesson08.task02;

/* Статические методы: int getCatCount() и setCatCount(int)

Добавить  к классу Cat два статических метода: int getCatCount() и setCatCount(int), с помощью которых можно получить/изменить количество котов (переменную catCount)

*/

public class Cat {

    public static int catCount;

    public Cat() {
        catCount++;
    }

    public static int getcatCount() {
        return catCount;
    }

    public static void setcatCount(int a) {
        Cat.catCount = a;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(Cat.getcatCount());
        Cat.setcatCount(2);
        System.out.println(Cat.getcatCount());
    }
}