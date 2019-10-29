package level20.lesson10.home01;

/*
Минимум изменений
Используя минимум изменений кода сделайте так, чтобы сериализация класса C стала возможной.
*/

import java.io.*;

public class Solution implements Serializable {

    public class A implements Serializable {
        String name = "A";

        public A(String name) {
            this.name += name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public class B extends A {
        String name = "B";

        public B(String name) {
            super(name);
            this.name += name;
        }
    }

    public class C extends B {
        String name = "C";

        public C(String name) {
            super(name);
            this.name = name;
        }
    }

    public static void main(String[] args) {
        try {
            C classC = new Solution().new C(" ИМЯ");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("task2016.data"));
            objectOutputStream.writeObject(classC);
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("task2016.data"));
            C classC2 = (C) objectInputStream.readObject();
            System.out.println(classC2.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}