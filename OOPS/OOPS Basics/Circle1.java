class Circle{

        public double radius;

        //method
        public double area(){
            return Math.PI * radius*radius;
        }

        public double permimeter(){
            return 2*Math.PI*radius;
        }

        public double circumference(){
            return permimeter();
        }
    }

//NOte:- For every new class java create new class file

public class Circle1 {


    public static void main(String[] args) {
        
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c1.radius=8;
        c2.radius=16;
 
        System.out.println(c1.area());
        System.out.println(c1.permimeter());
        System.out.println(c1.circumference());

        System.out.println(c2.area());
        System.out.println(c2.permimeter());
        System.out.println(c2.circumference());

    }
    
}
