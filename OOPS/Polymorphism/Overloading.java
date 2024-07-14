// package JAVAabdulBari.12. OOPS.Polymorphism;

public class Overloading {

    public static void main(String[] args) {

        Test t1 = new Test();
        t1.max(4,5);
        t1.max(4,5,9);

        System.out.println(t1.max(4,5,9));

    }
    
}

class Test{

    public int max(int a, int b){
        return a>b?a:b;
    }

    public int max(int a, int b, int c) {
        if(a>b && a>c) return a;
        else if(b>c) return b;

        return c;
    }
}
