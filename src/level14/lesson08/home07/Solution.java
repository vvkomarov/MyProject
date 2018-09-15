package level14.lesson08.home07;

/* Клининговый центр
Клининговый центр
1. Реализовать метод cleanAllApartaments.
Для каждого объекта из apartaments:
2. Для однокомнатных квартир (Apt1Room) вызвать метод clean1Room.
т.е. если объект типа Apt1Room, то вызвать у него метод clean1Room.
3. Для двухкомнатных квартир (Apt2Room) вызвать метод clean2Rooms
т.е. если объект типа Apt2Room, то вызвать у него метод clean2Rooms.
4. Для трехкомнатных квартир (Apt3Room) вызвать метод clean3Rooms
т.е. если объект типа Apt3Room, то вызвать у него метод clean3Rooms.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Apartament> apartaments = new ArrayList<Apartament>();
        apartaments.add(new Apt1Room());
        apartaments.add(new Apt2Room());
        apartaments.add(new Apt3Room());
        cleanAllApartaments(apartaments);
    }

    public static void cleanAllApartaments(List<Apartament> apartaments) {
        //написать тут вашу реализацию пунктов 1-4
        for (Object o : apartaments) {
            if (o instanceof Apt1Room) {
                ((Apt1Room) o).clean1Room();
            } else if (o instanceof Apt2Room) {
                ((Apt2Room) o).clean2Rooms();
            } else {
                ((Apt3Room) o).clean3Rooms();
            }
        }
    }

    static interface Apartament {
    }

    static class Apt1Room implements Apartament {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class Apt2Room implements Apartament {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class Apt3Room implements Apartament {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}