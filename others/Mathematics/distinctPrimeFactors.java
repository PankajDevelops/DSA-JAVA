package DSA.Mathematics;

import java.util.*;

public class distinctPrimeFactors {

    static Set<Integer> st = new HashSet<>();

    public static void printPrimeFactors(int n ){

        for(int i=2; i<=Math.sqrt(n); i++){

            while(n%i==0){
                st.add(i);
                n/=i;
            }
        }

        if(n>1) st.add(n);
        
    }

    public static void main(String[] args) {
        
        int arr[] = {2,4,8,16};
        int n = arr.length;

        st.clear();

        for(int i=0; i<n; i++){
            printPrimeFactors(arr[i]);
        }

        System.out.println(st);

    }
    
}

//perfect code working brother !!!
