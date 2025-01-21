public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.move();
        Vehicle boat = new Boat();
        boat.start();
        boat.move();
    }
}