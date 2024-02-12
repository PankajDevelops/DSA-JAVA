import java.util.*;

public class testString {

    public static void main(String[] args) {

    int arr[] = {-8,2,3,-6,10};
    int n = arr.length;
    int k = 2;

    for(int i=0; i<=n-k; i++){
        int num = 0;
        for(int j=i; j<i+k; j++){
            if(arr[j]<0){
                num = arr[j];
                break;
            }
        }
        System.out.print(num+" ");
    }
    System.out.println("h");
   }
       
    }
