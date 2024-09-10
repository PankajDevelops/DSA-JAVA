// package Maths.LEVEL_02;
import java.util.*;
public class sieveOfErosthenes {

    public static void main(String[] args) {
        
        int n = 10;
        int x = (int)Math.sqrt(n);

        boolean isPrime[] = new boolean[n];

        Arrays.fill(isPrime,true);

        for(int i=2; i<=x; i++){

            if(isPrime[i]){

                for(int j = i*i; j<n; j+=i){
                    isPrime[j] = false;
                }

            }
        }

        int count = 0;

        for(int i=2; i<n; i++){
            if(isPrime[i]){
                count++;
            }
        }

        System.out.println(count);

    }
    
}
