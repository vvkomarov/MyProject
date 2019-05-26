package level17.lesson10.bonus01;

/* CRUD
        CrUD - Create, Update, Delete
        Программа запускается с одним из следующих наборов параметров:
        -c name sex bd
        -u id name sex bd
        -d id
        -i id

        Значения параметров:
        name - имя, String
        sex - пол, "м" или "ж", одна буква
        bd - дата рождения в следующем формате 15/04/1990
        -c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
        -u  - обновляет данные человека с данным id
        -d  - производит логическое удаление человека с id
        -i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

        id соответствует индексу в списке
        Все люди должны храниться в allPeople
        Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
        Пример параметров: -c Миронов м 15/04/1990
        */

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        //start here - начни тут
        String name = null;
        String sex = null;
        Date bd = null;
        int id = 0;
        SimpleDateFormat format = new SimpleDateFormat("DD/mm/yyyy", Locale.ENGLISH);
        switch (args[0].toString()) {
            case "-c":
                name = args[1].toString();
                sex = args[2].toString();
                bd = format.parse(args[3].toString());
                if (sex.equals("м")) {
                    allPeople.add(Person.createMale(name, bd));
                    System.out.println("Добавлен " + name);
                } else if (sex.equals("ж")) {
                    allPeople.add(Person.createFemale(name, bd));
                    System.out.println("Добавлена " + name);
                }
                System.out.println("id добавленного человека " + (allPeople.size() - 1));
                break;
            case "-u":
                id = Integer.parseInt(args[1]);
                name = args[2].toString();
                sex = args[3].toString();
                bd = format.parse(args[4].toString());
                System.out.println("Данные до обновления : " + allPeople.get(id).getName() + " " + allPeople.get(id).getSex() + " " + allPeople.get(id).getBirthDay());
                allPeople.get(id).setName(name);
                if (sex.equals("м")) {
                    allPeople.get(id).setSex(Sex.MALE);
                } else if (sex.equals("ж")) {
                    allPeople.get(id).setSex(Sex.FEMALE);
                }
                allPeople.get(id).setBirthDay(bd);
                System.out.println("Данные после обновления : " + allPeople.get(id).getName() + " " + allPeople.get(id).getSex() + " " + allPeople.get(id).getBirthDay());
                break;
            case "-d":
                id = Integer.parseInt(args[1]);
                if (id < allPeople.size()) {
                    allPeople.get(id).setName(null);
                    allPeople.get(id).setBirthDay(null);
                    allPeople.get(id).setSex(null);
                    System.out.println("Запись о человеке с id " + id + " удалена");
                } else {
                    System.out.println("Человек с id " + id + " не найден");
                }
                break;
            case "-i":
                id = Integer.parseInt(args[1]);
                Person person = allPeople.get(id);
                name = person.getName();
                bd = person.getBirthDay();
                if (person.getSex() == Sex.MALE) {
                    sex = "м";
                } else {
                    sex = "ж";
                }
                if (id < allPeople.size()) {
                    System.out.println(name + " " + sex + " " + format.format(bd));
                } else {
                    System.out.println("Человек с id " + id + " не найден");
                }
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}