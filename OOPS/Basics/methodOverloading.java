package OOPS.Basics;

public class methodOverloading {

    public static void main(String[] args) {

        Greet g1 = new Greet();
        g1.greetings();
        g1.greetings("Pankaj");

        g1.greetings("Pankaj",7);

    }

}

class Greet {

    void greetings() {
        System.out.println("Hello, Good Morning");
    }

    void greetings(String name) {
        System.out.println("Hello," + name + " Good Morning");
    }

    void greetings(String name, int count) {
        
        for(int i=1; i<=count; i++){
            System.out.println("Hello," + name + " Good Morning");
        }
    }

}
