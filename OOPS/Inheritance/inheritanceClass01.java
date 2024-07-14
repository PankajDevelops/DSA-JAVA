// package JAVA Abdul Bari.12. OOPS.Inheritance;


class circle{

    public double radius;

    public double area(){
        return Math.PI * radius * radius;
    }

}

class Cylinder extends circle{

    public double height;

    public double volume(){
        return area()*height;
    }


}

public class inheritanceClass01 {

    public static void main(String[] args) {

        Cylinder c = new Cylinder();

        c.radius = 7;
        c.height = 9;

        System.out.println(c.volume());
        System.out.println(c.area());
        


    }
    
}
