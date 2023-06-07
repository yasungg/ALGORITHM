package 다형성연습2;

public class Vehicle {
    public void run() {
        System.out.print("차량이 달립니다.");
    }
    public void stop() {
        System.out.print("멈춥니다.");
    }
}
class Bus extends Vehicle {
    @Override
    public void run() {
        System.out.print("버스가 달립니다.");
    }
    public void stop() {
        System.out.print("버스가 멈춥니다.");
    }
}
class Taxi extends Vehicle {
    @Override
    public void run() {
        System.out.print("택시가 달립니다.");
    }
    public void stop() {
        System.out.print("택시가 멈춥니다.");
    }
}
class SportsCar extends Vehicle {
    @Override
    public void run() {
        System.out.print("스포츠카가 달립니다.");
    }
    public void stop() {
        System.out.print("스포츠카가 멈춥니다.");
    }
}
