import java.util.*;

/*Input: nums = {1,2,3}
Output: {0,1,2,3,4,5,6}
Explanation: Seven distinct sum can be calculated
which are 0, 1, 2, 3, 4, 5 and 6.
0 if we do not choose any number.
1 if we choose only 1.
2 if we choose only 2.
3 if we choose only 3.
4 if we choose 1 and 3.
5 if we choose 2 and 3.
6 if we choose 1, 2 and 3.
 */

public class distinctSubset {

    public static void getSubset(int arr[], int idx,ArrayList<Integer> ls, int sum){

        if(idx>=arr.length){
            ls.add(sum);
            return;
        }

        getSubset(arr, idx+1, ls, sum+arr[idx]);
        getSubset(arr, idx+1, ls, sum);
    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3};

        ArrayList<Integer> ls = new ArrayList<>();

        getSubset(arr, 0,ls,0);

        System.out.println(ls);

        int[] nums = new int[ls.size()]; 
        
        for(int i=0; i<nums.length; i++){
            nums[i] = ls.get(i);
        }
        
        for(int num:nums){
            System.out.print(num+" ");
        }

    }
    
}
