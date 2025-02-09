package OOPS.Abstraction;

public class learnAbstract {

    public static void main(String[] args) {
        
        car c1 = new car();
        c1.accelerate();
        c1.brake();


    }
    
}

abstract class Vehicle{

    abstract void accelerate();
    abstract void brake();

}

class car extends Vehicle{

    @Override
    void accelerate(){
        System.out.println("car is accelerationg");
    }

    @Override
    void brake() {
        System.out.println("car is stopped");
    }

}