package level19.lesson03.task04;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950
В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        PersonScannerAdapter personScannerAdapter = new PersonScannerAdapter(new Scanner(new File("C:\\Users\\Admin\\Downloads\\text.txt")));
        Person person = personScannerAdapter.read();
        personScannerAdapter.close();
        System.out.println(person.toString());
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner scanner;

        PersonScannerAdapter(Scanner scanner) {
            this.scanner = scanner;
        }

        @Override
        public Person read() {
            String[] result = scanner.nextLine().split(" ");
            Calendar calendar = new GregorianCalendar(Integer.parseInt(result[5]), Integer.parseInt(result[4]) - 1, Integer.parseInt(result[3]));
            Date date = calendar.getTime();
            return new Person(result[1], result[2], result[0], date);
        }

        @Override
        public void close() {
            this.scanner.close();
        }
    }
}
