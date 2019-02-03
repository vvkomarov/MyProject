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

import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        //start here - начни тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        System.out.println(args[0]);
        StringTokenizer st = new StringTokenizer(a, " ");
        String param = st.nextToken();
        int id = 0;
        String name = null;
        String sex = null;
        Date bd = null;
        SimpleDateFormat format = new SimpleDateFormat("DD/mm/yyyy", Locale.ENGLISH);
        if (param.equals("-c")) {
            if (st.hasMoreTokens()) {
                name = st.nextToken();
                sex = st.nextToken();
                bd = format.parse(st.nextToken());
            }
            if (sex.equals("м")) {
                allPeople.add(Person.createMale(name, bd));
            } else if (sex.equals("ж")) {
                allPeople.add(Person.createFemale(name, bd));
            }
            System.out.println(allPeople.size());
        }

        if (param.equals("-u")) {
            if (st.hasMoreTokens()) {
                id = Integer.parseInt(st.nextToken());
                name = st.nextToken();
                sex = st.nextToken();
                bd = format.parse(st.nextToken());
            }
            System.out.println("Данные до обновления : " + allPeople.get(id).getName() + " " + allPeople.get(id).getSex() + " " + allPeople.get(id).getBirthDay());
            allPeople.get(id).setName(name);
            if (sex.equals("м")) {
                allPeople.get(id).setSex(Sex.MALE);
            } else if (sex.equals("ж")) {
                allPeople.get(id).setSex(Sex.FEMALE);
            }
            allPeople.get(id).setBirthDay(bd);
            System.out.println("Данные после обновления : " + allPeople.get(id).getName() + " " + allPeople.get(id).getSex() + " " + allPeople.get(id).getBirthDay());
        }

        if (param.equals("-d")) {
            if (st.hasMoreTokens()) {
                id = Integer.parseInt(st.nextToken());
            }
            allPeople.remove(id);
        }

        if (param.equals("-i")) {
            if (st.hasMoreTokens()) {
                id = Integer.parseInt(st.nextToken());
            }
            if (id < allPeople.size()) {
                System.out.println(allPeople.get(id).getName() + " " + allPeople.get(id).getSex() + " " + format.format(allPeople.get(id).getBirthDay()));
            } else {
                System.out.println("Человек с id " + id + " не найден");
            }
        }
        reader.close();
    }
}