package OOPS.Basics;

public class learnConstructors {

    public static void main(String[] args) {

        // Sum s1 = new Sum(2,3);
        Sum s1 = new Sum(2);
        s1.a = 8; //<----------------------------
        s1.add();

        Sum s2 = new Sum();
        s2.add();

    }

}

class Sum {

    int a, b;

    public void add() {
        System.out.println("a + b = " + (a + b));
    }

    public Sum() {
        a = 6; //-------------------------->
        b = 4;
        System.out.println("Creating a new Obj");
    }

    // public Sum(int n1, int n2){

    //     a=n1; 
    //     b=n2;
    // }

    public Sum(int q, int b) {

        this.a=a;
        this.b=b;
    }

    public Sum(int n1) {
    a = n1; //-------------------------->(constructor overloaded)
    b = 4;
    System.out.println("Creating a new Obj");
    }

}