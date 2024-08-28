package Maths.LEVEL_01;

public class primeFactors {

    public static void main(String[] args) {
        
        int n = 40;
        int m = n;

        for(int i=2; i<=m; i++){

            while(m%i==0){
                System.out.print(i+" ");
                m=m/i;
            }
        }

    }
    
}
