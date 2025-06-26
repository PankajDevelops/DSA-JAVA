package DSA.Mathematics;

public class smitNumber {

    public static void main(String[] args) {
        
        int n = 997;

        for(int i=2; i<=Math.sqrt(n); i++){
            
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }

        if(n>0) System.out.println(n);
    }
    
}
