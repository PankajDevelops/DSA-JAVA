package OOPS;

class Super{

    String skinColor;

    void sound(){
        System.out.println("Super can Sound");
    }

    void run(){
        System.out.println("Super Can Run");
    }
}

class Sub extends Super{

    @Override
    void sound(){
        System.out.println("Sub can Bark");
    }

}

public class Main {

    public static void main(String[] args) {
        
       Super s1 = new Sub();
       s1.sound();


    }
    
}
