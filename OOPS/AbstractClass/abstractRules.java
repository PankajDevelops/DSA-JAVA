// package JAVAabdulBari.12. OOPS.AbstractClass;

abstract class Super{

    abstract public void meth1();
}

 class sub extends Super{

    @Override
    public void meth1(){
        System.out.println("sub");
    }

    public void meth2() {
        System.out.println("sub-2");
    }
}



public class abstractRules {

    public static void main(String[] args) {
        
        sub s = new sub();
        s.meth1();
        s.meth2();

    }
    
}
