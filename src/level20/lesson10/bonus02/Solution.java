package level20.lesson10.bonus02;

/* Алгоритмы-прямоугольники
1. Дан двумерный массив N*N, который содержит несколько прямоугольников.
2. Различные прямоугольники не соприкасаются и не накладываются.
3. Внутри прямоугольник весь заполнен 1.
4. В массиве:
4.1) a[i, j] = 1, если элемент (i, j) принадлежит какому-либо прямоугольнику
4.2) a[i, j] = 0, в противном случае
5. getRectangleCount должен возвращать количество прямоугольников.
6. Метод main не участвует в тестировании
*/

public class Solution {
    public static void main(String[] args) {
        byte[][] a = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        int count = getRectangleCount(a);
        System.out.println("count = " + count + ". Должно быть 2");

        byte[][] b = new byte[][]{
                {1, 1, 0, 0, 0, 0},
                {1, 1, 0, 1, 1, 0},
                {1, 1, 0, 0, 0, 0},
                {1, 1, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {1, 1, 0, 1, 0, 1}
        };
        int countB = getRectangleCount(b);
        System.out.println("count = " + countB + ". Должно быть 5");
    }

    private static int getRectangleCount(byte[][] a) {
        int count = 0;
        int[] startX = {0, 0};
        boolean findX = false;
        for (int j = 0; j < a.length; j++) {
            if (findX == true) {
                if (startX[0] + 1 == a.length) {
                    count++;
                    findX = false;
                } else {
                    for (int p = startX[0] + 1; p < a.length; p++) {
                        if (a[p][startX[1]] == 0) {
                            count++;
                            findX = false;
                            break;
                        } else if (p + 1 == a.length) {
                            count++;
                            findX = false;
                            break;
                        } else {

                        }
                    }
                }
            } else {
                for (int k = 0; k < a.length; ) {
                    if (a[j][k] == 1) {
                        startX[0] = j;
                        startX[1] = k;
                        findX = true;
                        k++;
                    } else if (findX == true || k + 1 == a.length) {
                        break;
                    } else {
                        k++;
                    }
                }
            }
        }
        return count;
    }
}
