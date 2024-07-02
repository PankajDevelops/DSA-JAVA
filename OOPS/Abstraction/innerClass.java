package OOPS.Abstraction;

public class innerClass {

      class Toy{
        int price;
    }

    static class games {
        String genere;
    }

    public static void main(String[] args) {
        
        // Toy t1= new innerClass().new Toy();

        innerClass obj = new innerClass();
        Toy t1 = obj.new Toy();

        t1.price=45;


        games g1 = new games();
        g1.genere="racing";

    }
    
}
