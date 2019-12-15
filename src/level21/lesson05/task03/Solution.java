package level21.lesson05.task03;

/*
Ошибка в equals/hashCode
Исправьте ошибки реализаций методов equals и hashCode для класса Solution.
Требования:
1. Хешкоды одинаковых объектов должны быть равны.
2. Метод equals должен проверять равен ли переданный объект равен текущему (сравнение через ==).
3. Метод equals должен проверять является ли переданный объект объектом класса Solution.
4. Метод equals должен проверять значения всех полей у переданного объекта и текущего (учти что некоторые из них могут быть равны null).
5. Должно быть обеспечено корректное поведение HashSet с типом элементов Solution.
6. В классе Solution должен быть реализован метод hashCode.
*/

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Solution {
    private int anInt;
    private String string;
    private double aDouble;
    private Date date;
    private Solution solution;

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution(5, "test", 5, new Date(), null));
        System.out.println(s.contains(new Solution(6, "test1", 6, new Date(), null)));
        System.out.println(s.contains(new Solution(5, "test", 5, new Date(), null)));
        System.out.println(s.contains(new Solution(6, "test", 5, new Date(), null)));
    }

    public Solution(int anInt, String string, double aDouble, Date date, Solution solution) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = solution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solution solution1 = (Solution) o;
        return anInt == solution1.anInt &&
                Double.compare(solution1.aDouble, aDouble) == 0 &&
                Objects.equals(string, solution1.string) &&
                Objects.equals(date, solution1.date) &&
                Objects.equals(solution, solution1.solution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anInt, string, aDouble, date, solution);
    }
}
