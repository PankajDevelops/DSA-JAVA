package Recursion;

public class pip {

    public static void rec(int n){

        if(n==0) return;
        System.out.print("Pre"+n+" ");

        rec(n-1);
        System.out.print("In"+n+" ");

        rec(n-1);
        System.out.print("Post"+n+" ");
    }

    public static void main(String[] args) {
        
        rec(3);

    }
    
}
