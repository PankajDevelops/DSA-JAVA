package OOPS.Inheritance;

public class Car extends Vehicle {

    public void start() {
        super.start(); // ------>used to call imediate parent class
        System.out.println("Car is Starting");
    }

    Car() {
        super(4);
        System.out.println("Creating a Car created");
    }

    public static void main(String[] args) {

        Car obj = new Car();
        System.out.println(obj.wheelsCount);
        obj.wheelsCount = 9;

        obj.avg = 39;
        obj.speed = 90;

        obj.start();

        System.out.println(obj.wheelsCount);

    }

}
