package level10.lesson11.home04;

/* Большая зарплата

Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.

Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

public class Solution {

    public static void main(String[] args) {
        String b = "Я не хочу изучать Java, я хочу большую зарплату";
        /*char[] c = b.toCharArray();
        for (int j = 0; j < 40;j++) {
            for (int k = j; k < 40;k++) {
                System.out.print(c[k]);
            }
            System.out.println();
        } */
        for (int j = 0; j < 40; j++) {
            System.out.print(b.substring(j));
            System.out.println();
        }
    }

}