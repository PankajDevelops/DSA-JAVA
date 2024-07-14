// package JAVA Abdul Bari.12. OOPS.Inheritance;

class Parent {

    Parent() {
        System.out.println("Non-Param of Parent");
    }

    Parent(int x) {
        System.out.println("Param of parent " + x);
    }
}

class Child extends Parent {

    Child() {
        System.out.println("Non-Param of Child ");
    }

    Child(int x) {
        // super(x);
        System.out.println("Param of Child " + x);
    }

    Child(int x, int y) {
        super(x);
        System.out.println("2-Param of Child " + y);
    }
}

public class thisVsSuper {

    public static void main(String[] args) {

        Child c = new Child(11,89);

    }

}
