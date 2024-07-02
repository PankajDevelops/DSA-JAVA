// package Arrays & 2Ds.2Ds;

public class rotatedMatrixInDegree {

    public static void printMatrix(int arr[][], int r, int c){

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]+" ");
            }

            System.out.println("");
        }
    }

    public static void reverse(int arr[]){
        int left = 0;
        int right  = arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void transposeInPlace(int arr[][], int r, int c){

        for(int i=0; i<c; i++){
            for(int j=i; j<r; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]=temp;
            }
        }
    }

    public static void rotate(int[][] arr, int n){
        //transpose
        transposeInPlace(arr, n, n);
        //reverse each row

        for(int i=0; i<n ; i++){
            reverse(arr[i]);
        }

    }
    
    public static void main(String[] args) {

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = arr.length;
        int cols = arr[0].length;

        printMatrix(arr, rows,cols);
        System.out.println("");
        rotate(arr, cols);
        printMatrix(arr, rows,cols);
        
    }
}
