
import java.util.*;
public class maxProfit {

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n*2];

        for(int i=0; i<n*2; i++){
            arr[i]= sc.nextInt();
        }

        int capacity = sc.nextInt();

        int profit[] = new int[n];
        int weight[] = new int[n];

        int y = 0;
        int z = 0;

        for(int i=0; i<n*2; i++){
            if(i%2==0){
                weight[y]=arr[i];
                y++;
            }
            else{
                profit[z]=arr[i];
                z++;
            }
        }

        printArray(arr);
        System.out.println("");
        printArray(weight);
        System.out.println("");
        printArray(profit);
        System.out.println("");

        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0; i<n; i++){
            mp.put(weight[i],profit[i]);
        }

        System.out.println(mp.entrySet());

        int maxSum = 0;

        for(int i=0; i<n; i++){
            int sum = weight[i];
            if(){

            }
        }

        


    }
    
}
