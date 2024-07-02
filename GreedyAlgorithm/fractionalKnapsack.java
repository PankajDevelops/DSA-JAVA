package GreedyAlgorithm;
import java.util.*;
public class fractionalKnapsack {

    public static void main(String[] args) {
        
        int weight[] = {10, 20, 30};
        int value[] = {60, 100, 120};

        int W = 50;

        // double arr[][] = new double[weight.length][3];

        // for(int i=0; i<weight.length; i++){
        //     arr[i][0]=value[i]/(double)weight[i];
        //     arr[i][1]=weight[i];
        //     arr[i][2]=value[i];
        // }

        // Arrays.sort(arr,Comparator.comparingDouble(o -> o[0]));

        // int finalAns = 0;
        // int capacity = W;

        // for(int i=arr.length-1; i>=0; i--){

        //     if(capacity >= arr[i][1]){
        //         capacity -= arr[i][1];
        //         finalAns += arr[i][2];
        //     }
        //     else{
        //         finalAns += arr[i][0] * capacity;
        //         capacity = 0;
        //         break;
        //     }
        // }

        // System.out.println(finalAns);

//---------------------------------------------------Method - 02-------------------------

       double ratio[][] = new double[value.length][2];

       for(int i=0; i<value.length; i++){
        ratio[i][0] = i;
        ratio[i][1] = value[i]/(double)weight[i];
       }

       Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

       int capacity = W;
       int finalAns = 0; 

       for(int i=ratio.length-1; i>=0; i--){
        int idx = (int)ratio[i][0];
        if(capacity>=weight[idx]){
            finalAns+=value[idx];
            capacity-=weight[idx];
        }

        else{
            finalAns+= (capacity * ratio[i][1]);
            capacity = 0;
            break;
        }

       }


       System.out.println(finalAns);







    }
    
}
