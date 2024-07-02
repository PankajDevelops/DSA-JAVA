package OOPS.Inheritance;

public class Vehicle {

    int speed;
    int avg;
    int wheelsCount;

    Vehicle() {
        System.out.println("Creating a vehicle instance");
    }

    Vehicle(int wheelsCount) {
        this.wheelsCount = wheelsCount;
        System.out.println("Creating a vehicle with wheels");
    }

    public void start() {
        System.out.println("Starting");
    }

    final int gears = 6;

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        // v1.gears=90;

        System.out.println(v1.gears);

    }

}
