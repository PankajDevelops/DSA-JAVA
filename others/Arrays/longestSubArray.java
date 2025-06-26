package DSA.Arrays;

public class longestSubArray {

    public static void main(String[] args) {
        
       int result = 0;

       int k = 66;

       int arr[] = {47,54,66,47,54,66};
       int n = arr.length;
       
       
       for(int i=0; i<n; i++){
           int count = 0;
           int sum=0;
           int x = i;
           while(sum<=k){
               sum+=arr[x++];
               count++;
               if(sum==k){
                result = Math.max(result,count);
                
                break;
            }
        }
           
       }

       System.out.println(result);

    }
    
}
