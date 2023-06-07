package 다형성연습2;

public class PolyEx0601_1 {
    public static void main(String[] args) {
        Driver driver = new Driver("곽용석");
        Bus bus = new Bus();
        SportsCar sportsCar = new SportsCar();
        Taxi taxi = new Taxi();
        driver.drive(bus);
        driver.drive(sportsCar);
        driver.drive(taxi);
    }
}
