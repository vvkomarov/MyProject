package level10.lesson04.task03;

/* Задача №3 на преобразование целых типов

Расставь где нужно оператор приведения типа:

float f = 333.50;

int i = f;

byte b = i;


--
Добавить одну операцию по преобразованию типа, чтобы получался ответ: j = 0
float g = (float)128.50;
int h = (int)g;
int j = (int)(g + h);
*/

public class Solution {

    public static void main(String[] args) {
        float f = (float) 333.50;
        int i = (int) f;
        byte b = (byte) i;

        float g = (float) 128.50;
        int h = (int) g;
        int j = (byte) (int) (h + g);
        System.out.println(j);
    }

}
