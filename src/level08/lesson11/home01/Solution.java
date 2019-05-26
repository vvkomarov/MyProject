package level08.lesson11.home01;

/* Set из котов

1. Внутри класса Solution создать public static класс кот – Cat.

2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.

3. В методе main удалите одного кота из Set cats.

4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.

*/

import java.util.HashSet;

public class Solution {

    public static class Cat {

    }

    public static HashSet createCats(HashSet<Cat> hash) {
        hash.add(new Cat());
        hash.add(new Cat());
        hash.add(new Cat());
        return hash;
    }

    public static void printCats(HashSet<Cat> hash) {
        for (Cat cat : hash) {
            System.out.println(cat);
        }
    }

    public static void main(String[] args) {
        HashSet<Cat> hash = new HashSet<>();
        createCats(hash);
        hash.remove(hash.iterator().next());
        printCats(hash);
    }

}