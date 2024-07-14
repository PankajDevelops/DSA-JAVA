
class Cylinder{

    public double radius;
    public double height;

    public double lidArea(){
        return  Math.PI*radius*radius;
    }

    public double circumference(){
        return 2*(Math.PI*radius);
    }

    public double totalSurafceArea(){
        return 2*(Math.PI*radius*radius)+(2*Math.PI*radius*height);
    }

    public double volume(){
        return lidArea()*height;
    }

}


public class Cylinder1 {

    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();

        c1.radius = 16;
        c1.height = 14;

        System.out.println(c1.lidArea());
        System.out.println(c1.circumference());
        System.out.println(c1.totalSurafceArea());
        System.out.println(c1.volume());
        
    }
    
}
