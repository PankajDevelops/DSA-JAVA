package Mathematics.LEVEL_01;

import java.util.Scanner;

public class checkPrime {

    public static boolean checkPrime(int n){

        if(n==1) return false;

        for(int i=2; i<=Math.sqrt((int)n); i++){

            if(n%i==0){
                return false;
            }

        }

        return true;
    }

   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    System.out.println(checkPrime(n));
    
   }

    
    
}