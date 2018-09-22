package level14.lesson08.bonus03;

class Singleton {

    private static Singleton singleton = new Singleton();

    static Singleton getInstance() {
        return singleton;
    }

    private Singleton() {

    }

}
