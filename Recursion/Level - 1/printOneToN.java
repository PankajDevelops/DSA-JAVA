public class printOneToN {

    

     public static void printNR(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printNR(n-1);
        System.out.print(n+" ");
        

    }
    public static void printN(int n){

        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printN(n-1);

    }

    public static void main(String[] args) {

        int n = 5;

        printNR(n);
        System.out.println("");
        printN(n);
        
        


        
    }
    
}
