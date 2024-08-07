import java.util.*;

public class subsets {

    static List<List<Integer>> ans = new ArrayList<>();

    public static void printSub(int arr[], int i, List<Integer> ls){

        int n = arr.length;

        if(i>=n){
            ans.add(new ArrayList<>(ls));
            return;
        }

        ls.add(arr[i]);
        printSub(arr, i+1, ls);

        ls.remove(ls.size()-1);
        printSub(arr, i+1, ls);
    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3};

        List<Integer> ls = new ArrayList<>();

        printSub(arr,0,ls);

        System.out.println(ans);

    }
    
}
