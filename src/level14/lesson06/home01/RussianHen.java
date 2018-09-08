package level14.lesson06.home01;

public class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 16;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
