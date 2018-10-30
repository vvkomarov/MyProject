package level15.lesson12.bonus02;

public class TeaMaker extends DrinkMaker {
    @Override
    void makeDrink() {
        super.makeDrink();
    }

    @Override
    void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    @Override
    void pour() {
        System.out.println("Заливаем водой");
    }

    @Override
    void putIngredient() {
        System.out.println("Насыпаем чай");
    }
}
