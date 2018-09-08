package level14.lesson06.home01;

public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 11;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
