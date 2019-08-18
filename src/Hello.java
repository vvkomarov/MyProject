import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        int z = 1;
        int x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        int m = min(x, y);
        System.out.println("Минимальное число " + m);

    }

    public static int min(int a, int b) {
        int k;
        if (a > b) {
            k = b;
        } else {
            k = a;
        }
        return k;
    }
}