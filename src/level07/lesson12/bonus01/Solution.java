package level07.lesson12.bonus01;

/* Нужно исправить программу, чтобы компилировалась и работала

Задача:  Программа вводит с клавиатуры данные про котов и выводит их на экран. Пример:

Cat name is Barsik age is 6, weight is 5, tail = 22

Cat name is Murka age is 8, weight is 7, tail = 20

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<Cat> cats = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.equals("end")) {
                break;
            } else {
                Cat cat = new Cat(reader.readLine(), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
                cats.add(cat);
            }
        }
        for (Cat c : cats) {
            c.printCat();
        }
    }

    public static class Cat {
        String name;
        int age;
        int weight;
        int tail;

        Cat(String name, int age, int weight, int tail) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tail = tail;
        }

        public void printCat() {
            String text = "";
            text += "Cat name is " + name;
            text += " age is " + age;
            text += ",weight is " + weight;
            text += ", tail = " + tail;
            System.out.println(text);
        }
    }

}