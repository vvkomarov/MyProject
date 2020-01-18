package level21.lesson16.big01;

public class Horse {
    public String name;
    public double speed;
    public double distance;

    public Horse(String name, double speed, double distance) {
        this.speed = speed;
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void move() {
        int num = (int) Math.random();
        speed = speed * num;
        distance += speed;
    }

    public void print() {
        System.out.println("<- лошадь " + name);
    }
}
