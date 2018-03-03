import java.util.Scanner;

class Dog {
    int age;
    String name;

    Dog () {
        age = 4;
    }

    Dog (String a,int b){
        name=a;
        age=b;
    }

    protected void finalize() throws Throwable {
        System.out.println("Посмотри в собаке");
    }
}

class Box {
    double height;
    Dog dog;

    Double radius() {
            return height;
    }

    Double volume () {
        return height*height*height;
    }
}

public class Cat {

    public static void main(String args[]) throws Throwable {
        Dog dog = new Dog();
        dog.age = 5;
        dog.name = "Vasya";
        System.out.println(dog.age);
        System.out.println(dog.name);

        Box box = new Box();
        box.height = 3;
        box.dog = dog;

        System.out.println(box.radius());
        System.out.println("В коробке сидит " + box.dog.name);
        System.out.println("ему " + box.dog.age);
        System.out.println("Объём коробки = " + box.volume());

        Dog grisha = new Dog();
        grisha.name = "Grisha";
        System.out.println(grisha.age);
        System.out.println(grisha.name);

        Dog kolya = new Dog("Kolya", 6);
        System.out.println(kolya.name);
        System.out.println(kolya.age);

        Dog Many = new Dog();
        Many.finalize();
    }
}