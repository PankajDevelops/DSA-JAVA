// package JAVAabdulBari.12. OOPS.InnerClasses;

public class InnerClass {

    public static void main(String[] args) {

        Outer o = new Outer();
        o.display();

        

    }
    
}


class Outer{

        public void display(){

            class Inner{

                public void show(){
                    System.out.println("Hello");
                }
        }

        Inner i = new Inner();
        new Inner().show();
    }
}