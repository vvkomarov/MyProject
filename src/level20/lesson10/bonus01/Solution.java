package level20.lesson10.bonus01;

/* Алгоритмы-числа
Число S состоит из M чисел, например, S=370 и M(количество цифр)=3
Реализовать логику метода getNumbers, который должен среди натуральных чисел меньше N (long)
находить все числа, удовлетворяющие следующему критерию:
число S равно сумме его цифр, возведенных в M степень
getNumbers должен возвращать все такие числа в порядке возрастания
Пример искомого числа:
370 = 3*3*3 + 7*7*7 + 0*0*0
8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8
На выполнение дается 10 секунд и 50 МБ памяти.
int result = 0;
     int orig = NextArm;

     while(NextArm != 0){
          int digit = NextArm%10;
          result = result + digit*digit*digit;
          NextArm = NextArm/10;
     }

     if(orig == result){
          return false;
     }
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int[] getNumbers(int n) {
        try {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                char[] b = String.valueOf(i).toCharArray();
                int c = 0;
                for (char d : b) {
                    int o = Integer.parseInt(String.valueOf(d));
                    for (int q = 1; q < b.length; q++) {
                        o = o * Integer.parseInt(String.valueOf(d));
                    }
                    c += o;
                }
                if (i == c) {
                    list.add(i);
                }
            }
            int[] q = new int[list.size()];
            for (int j = 0; j < list.size(); j++) {
                q[j] = list.get(j);
            }
            return q;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Long t0 = System.currentTimeMillis();
        int[] m = getNumbers(1000000);
        Long t1 = System.currentTimeMillis();
        for (int a : m) {
            System.out.println(a);
        }
        System.out.println("Memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024d) + " Mb.");
        System.out.println("Time: " + (t1 - t0) / 1000d + " sec.");
    }
}
