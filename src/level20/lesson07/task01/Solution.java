package level20.lesson07.task01;

/* Externalizable для апартаментов
   Реализуйте интерфейс Externalizable для класса Квартира
   Подумайте, какие поля не нужно сериализовать.
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Apartment apt = new Apartment("г.Москва, Кутузовский просп., дом 18", 2017);
        ObjectOutputStream ou = new ObjectOutputStream(new FileOutputStream("task2011.dat"));
        ou.writeObject(apt);
        ou.close();
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("task2011.dat"));
        Apartment reApt = (Apartment) oi.readObject();
        System.out.println(reApt.toString());
        oi.close();
    }

    public static class Apartment implements Externalizable {
        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() {
            super();
        }

        public Apartment(String adr, int y) {
            address = adr;
            year = y;
        }

        /**
         * Prints out the fields. used for testing!
         */
        public String toString() {
            return ("Address: " + address + "\n" + "Year: " + year);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            address = (String) in.readObject();
            year = in.readInt();
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(address);
            out.writeInt(year);
        }
    }
}
