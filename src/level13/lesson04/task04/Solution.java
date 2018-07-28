package level13.lesson04.task04;

/* Класс BigFox
1. Исправь класс BigFox так, чтобы программа компилировалась.
2. Метод main менять нельзя.
*/

import java.awt.*;

public class Solution

{
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox {
        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public Color getColor() {
            return Color.RED;
        }
    }
}