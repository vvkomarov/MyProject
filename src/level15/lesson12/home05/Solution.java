package level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution(int a) {

    }

    public Solution(String b) {

    }

    public Solution(double k) {

    }

    protected Solution(int b, int a) {

    }

    protected Solution(String a, String b) {

    }

    protected Solution(double k, double b) {

    }

    private Solution(String a, int b) {

    }

    private Solution(int a, String b) {

    }

    private Solution(float c) {
    }

}
