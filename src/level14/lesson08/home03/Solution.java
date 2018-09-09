package level14.lesson08.home03;

/* User, Looser, Coder and Proger
1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: "user", "looser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.

2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см Person.java], например, для строки "user" нужно создать объект класса User.
2.2. Передать этот объект в метод doWork.

3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Looser.
3.3. Вызывает метод coding(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String b = reader.readLine();
            if (b.equals("user")) {
                Solution.doWork(new Person.User());
            } else if (b.equals("looser")) {
                Solution.doWork(new Person.Looser());
            } else if (b.equals("coder")) {
                Solution.doWork(new Person.Coder());
            } else if (b.equals("proger")) {
                Solution.doWork(new Person.Proger());
            } else {
                break;
            }
        }
    }

    public static void doWork(Object o) {
        if (o instanceof Person.User) {
            ((Person.User) o).live();
        } else if (o instanceof Person.Looser) {
            ((Person.Looser) o).doNothing();
        } else if (o instanceof Person.Coder) {
            ((Person.Coder) o).coding();
        } else {
            ((Person.Proger) o).enjoy();
        }
    }

}
