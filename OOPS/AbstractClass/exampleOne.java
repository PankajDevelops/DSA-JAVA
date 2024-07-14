// package JAVAabdulBari.12. OOPS.AbstractClass;

   abstract class Shape{
          abstract double perimeter();
          abstract double area();
    }

    class Circle extends Shape{  

        double radius;

        @Override
        double perimeter() {
            // TODO Auto-generated method stub
            return 2*Math.PI*radius;
        }
        @Override
        double area() {
            // TODO Auto-generated method stub
            return Math.PI*radius*radius;
        }
    }

    class Rectangle extends Shape{
        double length;
        double breadth;

        @Override
        double perimeter() {
            // TODO Auto-generated method stub
            return 2*(length*breadth);
        }

        @Override
        double area() {
            // TODO Auto-generated method stub
            return length*breadth;
        }
    }



public class exampleOne {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.length = 33;
        r.breadth = 21;

        // System.out.println(r.area());

        Shape s = r;
        System.out.println(s.area());

    }
    
}
