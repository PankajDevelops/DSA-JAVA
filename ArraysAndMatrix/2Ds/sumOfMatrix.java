// package Arrays & 2Ds.2Ds;

public class sumOfMatrix {

     public static void print2D(int arr[][]){
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        
        int arr1[][] = {{3,4},{6,8}};
        int arr2[][] = {{2,5},{4,7}};

        int arr[][] = new int[2][2];

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                arr[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        print2D(arr);

    }
    
}
