package DSA.Mathematics;
import java.util.*;

public class smallestValuePrimefactor {

    public static boolean isPrime(int n){

        if(n==1) return false;

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }

        return true;
    }

     public static int smallPrime(int n){

        if(isPrime(n)){
            return n;
        }

        int sum = 0;
        int original = n;

        for(int i=2; i<=Math.sqrt(n); i++){

            while(n%i==0){
                sum+=i;
                n/=i;
            }
        }

        if(n>1) sum+=n;

        if(sum==original)return n;

        return sum;
    }

    public static void main(String[] args) {
        
        int n = 9;

        System.out.println(smallPrime(n));
        

    }
    
}
