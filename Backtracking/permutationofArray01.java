package Backtracking;

import java.util.*;

public class permutationofArray01 {

    public static void getPerm(int arr[],List<List<Integer>> ans,List<Integer> ls, boolean isPerm[]){

        if(ls.size()==arr.length){
            ans.add(new ArrayList<>(ls));
            return;
        }

        for(int i=0; i<arr.length; i++){
            if(isPerm[i]==false){
                ls.add(arr[i]);
                isPerm[i]=true;
                getPerm(arr, ans, ls, isPerm);
                isPerm[i]=false;
                ls.remove(ls.size()-1);
            }
        }
        
    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3};

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();

        boolean isPerm[] = new boolean[arr.length];

        getPerm(arr, ans, ls,isPerm);

        System.out.println(ans);

    }
    
}
