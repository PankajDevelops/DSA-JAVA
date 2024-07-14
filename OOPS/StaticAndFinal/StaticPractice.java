// package JAVAabdulBari.12. OOPS.StaticAndFinal;

class Test {

    static int n = 10;

    int x = 20;

    void show() {
        System.out.println(x + " " + n);
    }

    static void display() {
        System.out.println(n);
    }

}

public class StaticPractice {

    public static void main(String[] args) {

        Test t1 = new Test();
        t1.show();
        t1.x=30;
        t1.n=60;

        Test t2 = new Test();
        t2.show();

    }

}
