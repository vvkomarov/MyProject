package level14.lesson06.home01;

public class BelarusianHen extends Hen {
    @Override
    public String getDescription() {
        return super.getDescription() + " моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 15;
    }
}
