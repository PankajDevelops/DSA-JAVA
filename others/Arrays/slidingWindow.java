package Arrays;

public class slidingWindow {

    public static void main(String[] args) {
        
        int arr[] = {100,200,300,400,500};
        int n = arr.length;
        int k = 3;

        int firstKSum = 0;

        for(int i=0; i<k; i++){
            firstKSum+=arr[i];
        }

        int res = firstKSum;
        int j = 0;

        for(int i=k; i<n; i++){
            firstKSum-=arr[j++];
            firstKSum+=arr[i];
            res = Math.max(res, firstKSum);
            

        }

        System.out.println(res);

    }
    
}
