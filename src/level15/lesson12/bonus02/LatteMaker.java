package level15.lesson12.bonus02;

public class LatteMaker extends DrinkMaker {

    @Override
    void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    @Override
    void pour() {
        System.out.println("Делаем кофе");
    }

    @Override
    void putIngredient() {
        System.out.println("Заливаем молоком с пенкой");
    }

    @Override
    void makeDrink() {
        super.makeDrink();
    }
}
