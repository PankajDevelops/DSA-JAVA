// package JAVAabdulBari.12. OOPS.Interfaces;

interface test {

    void meth1();

    void meth2();
}

class My implements test {

    public void meth1() {
        System.out.println("Meth1");
    }

    public void meth2() {
        System.out.println("Meth2");
    }

    public void meth3() {
        System.out.println("Meth3");
    }

}

public class interfacePractice {

    public static void main(String[] args) {

        test t = new My();

        t.meth1();
        t.meth2();

    }

}
