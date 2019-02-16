package level17.lesson10.bonus02;
/* CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion
!!!РЕКОМЕНДУЕТСЯ выполнить level17.lesson10.bonus01 перед этой задачей!!!

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...

Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u  - обновляет соответствующие данные людей с заданными id
-d  - производит логическое удаление всех людей с заданными id
-i  - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
*/

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
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
                for (int i = 1; i < args.length; ) {
                    name = args[i].toString();
                    sex = args[i + 1].toString();
                    bd = format.parse(args[i + 2].toString());
                    if (sex.equals("м")) {
                        allPeople.add(Person.createMale(name, bd));
                        System.out.println("Добавлен " + name);
                    } else if (sex.equals("ж")) {
                        allPeople.add(Person.createFemale(name, bd));
                        System.out.println("Добавлена " + name);
                    }
                    System.out.println("id добавленного человека " + (allPeople.size() - 1));
                    i = i + 3;
                }
                break;
            case "-u":
                for (int i = 1; i < args.length; ) {
                    id = Integer.parseInt(args[i]);
                    name = args[i + 1].toString();
                    sex = args[i + 2].toString();
                    bd = format.parse(args[i + 3].toString());
                    System.out.println("Данные до обновления : " + allPeople.get(id).getName() + " " + allPeople.get(id).getSex() + " " + allPeople.get(id).getBirthDay());
                    allPeople.get(id).setName(name);
                    if (sex.equals("м")) {
                        allPeople.get(id).setSex(Sex.MALE);
                    } else if (sex.equals("ж")) {
                        allPeople.get(id).setSex(Sex.FEMALE);
                    }
                    allPeople.get(id).setBirthDay(bd);
                    System.out.println("Данные после обновления : " + allPeople.get(id).getName() + " " + allPeople.get(id).getSex() + " " + allPeople.get(id).getBirthDay());
                    i = i + 4;
                }
                break;
            case "-d":
                for (int j = 1; j < args.length; j++) {
                    for (int k = j + 1; k < args.length; k++) {
                        if (Integer.parseInt(args[k]) > Integer.parseInt(args[j])) {
                            int temp = Integer.parseInt(args[k]);
                            args[k] = args[j];
                            args[j] = String.valueOf(temp);
                        }
                    }
                }
                for (int i = 1; i < args.length; i++) {
                    if (Integer.parseInt(args[i]) < allPeople.size()) {
                        id = Integer.parseInt(args[i]);
                        allPeople.remove(id);
                        System.out.println("Запись о человеке с id " + id + " удалена");
                    } else {
                        System.out.println("Человек с id " + args[i] + " не найден");
                    }
                }
                break;
            case "-i":
                for (int i = 1; i < args.length; i++) {
                    if (Integer.parseInt(args[i]) < allPeople.size()) {
                        id = Integer.parseInt(args[i]);
                        Person person = allPeople.get(id);
                        name = person.getName();
                        bd = person.getBirthDay();
                        if (person.getSex() == Sex.MALE) {
                            sex = "м";
                        } else {
                            sex = "ж";
                        }
                        System.out.println(name + " " + sex + " " + format.format(bd));
                    } else {
                        System.out.println("Человек с id " + args[i] + " не найден");
                    }
                }
                break;
        }
    }
}
