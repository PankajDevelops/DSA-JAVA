package Backtracking;

import java.util.*;

public class permutationofArray02 {

        public static void getPerm(int arr[],List<List<Integer>> ans, int idx){

        if(idx==arr.length-1){
            List<Integer> list = new ArrayList<>();
            for (int num : arr) {
                list.add(num);
            }
            ans.add(list);
            return;
        }

        for(int i=idx; i<arr.length; i++){
            swap(arr, idx, i);
            getPerm(arr, ans, idx+1);
            swap(arr, idx, i);
        }
    }

    public static void swap(int arr[], int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3};

        List<List<Integer>> ans = new ArrayList<>();

        getPerm(arr,ans, 0);

        System.out.println(ans);

    }
    
}
