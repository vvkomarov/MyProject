package level20.lesson04.task04;

import java.io.*;

/*Как сериализовать static?
Сделайте так, чтобы сериализация класса ClassWithStatic была возможной
*/
public class Solution {
    public static class ClassWithStatic implements Serializable {
        public static String staticString = "it's test static string";
        public int i;
        public int j;
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        ClassWithStatic classWithStatic1 = new ClassWithStatic();
        classWithStatic1.i = 5;
        classWithStatic1.j = 10;
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ClassWithStatic.tmp"));
        outputStream.writeObject(classWithStatic1);
        outputStream.close();


        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ClassWithStatic.tmp"));
        ClassWithStatic classWithStatic2 = (ClassWithStatic) inputStream.readObject();
        inputStream.close();
        System.out.println(classWithStatic2.i);
        System.out.println(classWithStatic2.j);
    }
}
