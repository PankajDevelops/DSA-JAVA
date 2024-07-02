// package Arrays & 2Ds.Arrays Lev -2;

public class presentQuery {

    public static int[] frequencyArray(int arr[]){

        int[] freq = new int [100005];

        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;

        }
        return freq;
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 4, 5, 9, 11, 45, 78, 108};
        int[] freq = frequencyArray(arr);

        int[] qrr = {4, 11, 3, 6, 7, 45, 345, 108};

        int q  = qrr.length;
        int i = 0;

        while(q>0){

            if(freq[qrr[i]]>0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            i++;
            q--;
        }

        
        

    }
    
}
