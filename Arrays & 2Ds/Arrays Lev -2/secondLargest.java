// package Arrays & 2Ds.Arrays Lev -2;

public class secondLargest {

    public static void main(String[] args) {
        
        int arr[] = {3,5,7,4,3,6,8,9};

        int max = 0;
        int sMax = 0;

        for(int i=0; i<arr.length; i++){
            
            if(arr[i]>max){
                sMax=max;
                max=arr[i];
            }
            else if(sMax<arr[i]){
                sMax = arr[i];
            }
        }

        System.out.println(sMax);

    }
    
}
