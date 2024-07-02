import java.lang.reflect.Array;
import java.util.*;

public class nCoins {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        String arr[] = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for(String i : arr){
            sb.append(i);
        }
        System.out.println(sb.toString());
        
    }
    
}
