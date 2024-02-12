import java.util.*;

public class uglyNumber {

    public static boolean isUgly(int n){

        if(n<1) return false;

        while(n>2){

            if(n%2==0) n=n/2;

            else if(n%3==0) n=n/3;

            else if(n%5==0) n=n/5;

            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int n = 6;

        System.out.println(isUgly(n));
        
    }
    
}
