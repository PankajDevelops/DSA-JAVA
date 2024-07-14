// package JAVAabdulBari.12. OOPS.InnerClasses;

public class nestedInner {

    public static void main(String[] args) {

        // Outer o = new Outer();
        // o.outerDisplay();

        Outer.Inner oi = new Outer(). new Inner();

        oi.innerDisplay();

    }

}

class Outer {

    int x = 9;

    class Inner {
        int y = 13;

        public void innerDisplay() {
            System.out.println(x + " " + y);
        }
    }

    public void outerDisplay() {
        Inner i = new Inner();
        i.innerDisplay();
    }

}
