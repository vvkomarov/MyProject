package level20.lesson10.home02;

/*
Десериализация
На вход подается поток, в который записан сериализованный объект класса A либо класса B.
Десериализуй объект в методе getOriginalObject так, чтобы в случае возникновения исключения было
выведено сообщение на экран и возвращен null.
Реализуй интерфейс Serializable где необходимо.
Требования:
1. Класс B должен быть потомком класса A.
2. Класс A должен поддерживать интерфейс Serializable.
3. Класс B не должен явно поддерживать интерфейс Serializable.
4. Метод getOriginalObject должен возвращать объект типа A полученный из потока ObjectInputStream.
5. Метод getOriginalObject должен возвращать null, если при попытке десериализации не был получен объект типа A.
6. Метод getOriginalObject должен возвращать null, если при попытке десериализации возникло исключение.
*/

import java.io.*;

public class Solution implements Serializable {
    public static void main(String[] args) throws Exception {
        A classA = new Solution().new A();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("task2017.data"));
        objectOutputStream.writeObject(classA);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("task2017.data"));
        A classA2 = new Solution().getOriginalObject(objectInputStream);
        System.out.println(classA2.toString());
    }

    public class A implements Serializable {
        @Override
        public String toString() {
            return "test";
        }
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public A getOriginalObject(ObjectInputStream objectStream) {
        A classA = null;
        try {
            classA = (A) objectStream.readObject();
        } catch (NotSerializableException e) {
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return classA;
    }
}
