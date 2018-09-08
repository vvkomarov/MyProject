package level14.lesson06.home01;

public class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 14;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
