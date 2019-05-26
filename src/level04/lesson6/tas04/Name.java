package level04.lesson6.tas04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static jdk.nashorn.internal.objects.NativeString.length;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/
public class Name {
    public static void main(String args[]) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String a = rd.readLine();
        String b = rd.readLine();
        if (a.equals(b)) {
            System.out.println("Имена идентичны");
        } else {
            if (length(a) == length(b)) { //a.length() == b.length()
                System.out.println("Длины имен равны");
            }
        }
    }
}
