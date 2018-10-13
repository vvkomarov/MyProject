package level15.lesson12.home04;

public class Earth implements Planet {

    private static Earth earth;

    private Earth() {

    }

    public static Earth getEarth() {
        if (earth == null) {
            earth = new Earth();
        }
        return earth;
    }
}
