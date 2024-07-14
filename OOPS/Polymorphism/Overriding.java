// package JAVAabdulBari.12. OOPS.Polymorphism;

public class Overriding {

    public static void main(String[] args) {

        Super s1 = new Super();
        s1.dispaly();

    }
    
}

class Super{

    public void dispaly(){
        System.out.println("Super Display");
    }

}

class sup extends Super {

    public void dispaly() {
        System.out.println("Sup Display");
    }

}
