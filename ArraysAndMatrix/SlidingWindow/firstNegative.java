package ArraysAndMatrix.SlidingWindow;

public class firstNegative {

    public static void main(String[] args) {

        int arr[] = {-10,20,-30,-40,50,60,-70,80,90};
        int n = arr.length;
        int k = 3;

        int ans[] = new int[n-k+1];

        int p = -1;

        for(int i=0; i<k; i++){
            if(arr[i]<0){
                p = i;
                break;
            }
        }

        if(p==-1) ans[0] = 0;
        else ans[0] = arr[p];

        int i = 1;
        int j = 0;

        while(j<n){
            if(p>=i) ans[i] = arr[p];
            else{
                for(p=i; p<=j; p++){
                    if(arr[p]<0) break;
                }
                ans[i] = arr[p];
            }
        }
        


    }
    
}
