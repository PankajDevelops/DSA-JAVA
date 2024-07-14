// package JAVAabdulBari.12. OOPS.AbstractClass;

abstract class Super{

    abstract public void meth1();
}

 class sub extends Super{

    public void meth1(){
        System.out.println("sub");
    }
}



public class abstractRules {

    public static void main(String[] args) {
        
        Super s = new sub();
        s.meth1();

    }
    
}
