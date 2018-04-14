package level09.lesson11.home02;

/* Обратный отсчёт от 10 до 0

Написать в цикле обратный отсчёт от 10 до 0. Для задержки иcпользовать Thread.sleep(100);

Обернуть вызов sleep в try..catch.

*/

public class Solution {

    public static void main(String[] args) {
        try {
            for (int j = 10; j > -1; j--) {
                System.out.println(j);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
