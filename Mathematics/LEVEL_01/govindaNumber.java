package Mathematics.LEVEL_01;
import java.util.Scanner;

public class govindaNumber {

    public static void main(String[] args) {
        
        int n = 378;
        int m=n;
        int k=m;
        int prim = 0;

        int sum=0;

        while(k!=0){
            int digit = k%10;
            sum= sum+digit;
            k=k/10;
        }

        for(int i=2; i<=n; i++){
            while(m%i==0){
               prim+=i;
               m=m/i;
            
            }
        }

       if(sum==prim){
        System.out.println("Govinda Number");
       }
       else{
        System.out.println("Not Govinda Number");
       }

    }
}
