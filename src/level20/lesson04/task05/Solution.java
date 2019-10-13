package level20.lesson04.task05;

/*
Как сериализовать что-то свое?
Сделайте так, чтобы сериализация класса Object была возможной.
*/

import java.io.Serializable;

public class Solution {
    public static class Object implements Serializable {
        public String string1;
        public String string2;
    }

    public static int countStrings;

    public static class String implements Serializable {
        private final int number;

        public String() {
            number = ++countStrings;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }

    public static void main(java.lang.String[] args) {

    }
}
