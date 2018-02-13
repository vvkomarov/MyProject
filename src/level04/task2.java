package level04;
/*
Среднее из 3 чисел
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {
    public static void main (String args[]) throws IOException {
        System.out.println("Введите 3 числа");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int f, g, h;
        String a = reader.readLine();
        f = Integer.parseInt(a);
        String b = reader.readLine();
        g = Integer.parseInt(b);
        String c = reader.readLine();
        h = Integer.parseInt(c);
        int z = avg(f, g, h);
        System.out.println ("Среднее число "+z);
    }

    public static int avg (int j, int k, int l) {
        int min;
        int max;
        int avg;
        if (j > k) {
            max=j;
            min=k;
        } else {
            max=k;
            min = j;
        }
        if (l > max) {
            avg=max;
            max = l;
        } else {
            if ( l > min) {
                avg = l;
            } else {
                avg = min;
            }
        }
        return avg;
    }
}
