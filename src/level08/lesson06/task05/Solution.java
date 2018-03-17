package level08.lesson06.task05;

/* Четыре метода

Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций).
Ничего измерять не нужно.

*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

    }

    public static List getListForGet() {

        return new ArrayList();

    }


    public static List getListForSet() {

        return new ArrayList();

    }


    public static List getListForAddOrInsert() {

        return new LinkedList();

    }


    public static List getListForRemove() {

        return new LinkedList();

    }

}