package level22.lesson05.home01;

public class TooShortStringSecondThreadException extends RuntimeException {
    @Override
    public synchronized Throwable getCause() {
        return new StringIndexOutOfBoundsException();
    }
}