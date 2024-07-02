package OOPS.Basics;

public class classesAndObjects {

    public static void main(String[] args) {

        dog d1 = new dog(); 
        d1.walk();


        cat c1 = new cat();
        c1.name = "Catty";
        c1.age = 6;
        
        System.out.println("My cat name is "+c1.name+" ans its age is "+ c1.age+" and my cat is ");
        c1.walk();


    }
    
}

class dog{ //factory

    String name;
    int age; //properties

    public void walk() {
        System.out.println("Dog can walk"); // bheaviours
    }
}

class cat {

    String name;
    int age;

    public void walk(){
        System.out.println("Cat can walk"); //bheaviours
    }

}