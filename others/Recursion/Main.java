package Recursion;
import java.util.*;

public class Main {

    static List<List<Integer>> ls = new ArrayList<>();

    public static void printN(String str, String ans){

       if(str.equals("")){
            System.out.print(ans+" ");
            return;
        }

        for(int i=0; i<str.length(); i++){

            char ch = str.charAt(i);

            String s1 = str.substring(0, i);
            String s2 = str.substring(i+1);

            printN(s1+s2, ans+ch);
        }

    }

    public static void find(int arr[], int idx, List<Integer> ans){
        
        if(idx>=arr.length){
            ls.add(new ArrayList<>(ans));
            return;
        }

        ans.add(arr[idx]);
        find(arr, idx+1, ans);

        ans.remove(ans.size()-1);
        find(arr, idx+1, ans);

    }

    public static void main(String[] args) {
        
        String str = "abc";
        char ch = 'a';


        printN("abc","");
        
        System.out.println(getN(str));

        List<Integer> ans = new ArrayList<>();

        int arr[] = {1,2,3};

        // find(arr,0,ans);

        // System.out.println(ls);

    }


    
}
