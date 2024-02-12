import java.util.*;

public class heapify {

    public static int isUgly(int n){

        int count = 0;

        while(n!=0){
            if(n%2==0){
                n=n/2;
                count++;
            }else{
                n=n-1;
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {

        int n = 23;

        System.out.println(isUgly(n));
        
    }
    
}
