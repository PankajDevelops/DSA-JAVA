package DSA.Mathematics;

import java.util.*;
public class Main {

    public static void main(String[] args) {

        int a = 3;
        int b = 2;

        int ans = 1;

        while(b>0){

            if((b&1)==1){
                ans*=a;
            }
            
            a*=a;
            b=b>>1;
        }

        System.out.println(ans);
        
    }
    
}
