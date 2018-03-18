package level08.lesson11.home02;

/* Множество всех животных

1. Внутри класса Solution создать public static классы Cat, Dog.

2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.

3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.

4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.

5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.

6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки

*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static class Cat {

    }

    public static class Dog {

    }

    public static Set createCats(HashSet<Cat> cat) {
        cat.add(new Cat());
        cat.add(new Cat());
        cat.add(new Cat());
        cat.add(new Cat());
        return cat;
    }

    public static Set createDogs(HashSet<Dog> dog) {
        dog.add(new Dog());
        dog.add(new Dog());
        dog.add(new Dog());
        return dog;
    }

    public static Set join(HashSet<Cat> cat, HashSet<Dog> dog) {
        HashSet<Object> pets = new HashSet<>();
        pets.addAll(cat);
        pets.addAll(dog);
        return pets;
    }

    public static Set removeCats(Set<Object> pets) {
        ArrayList<Object> pet = new ArrayList<>();
        pet.addAll(pets);
        for (int j = 0; j < pet.size(); ) {
            if (pet.get(j) instanceof Dog) {
                pet.remove(j);
            } else {
                j++;
            }
        }
        for (int j = 0; j < pet.size(); j++) {
            pets.remove(pet.get(j));
        }
        return pets;
    }

    public static void printPets(Set<?> pets) {
        pets.forEach(System.out::println);
    }

    public static void main(String[] args) {
        HashSet<Cat> cat = new HashSet<>();
        createCats(cat);
        HashSet<Dog> dog = new HashSet<>();
        createDogs(dog);
        Set<Object> pets = join(cat, dog);
        printPets(pets);
        System.out.println();
        removeCats(pets);
        printPets(pets);
    }

}