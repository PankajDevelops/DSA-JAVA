// package Arrays & 2Ds.2Ds;

public class transposeMatrix {

    public static void printMatrix(int arr[][], int r, int c){

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]+" ");
            }

            System.out.println("");
        }
    }

    public static int[][] transposeMatrix(int arr[][], int r, int c){

        int ans[][] = new int[c][r];
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){

                ans[i][j]=arr[j][i];
            }
        }

        return ans;
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

    public static void main(String[] args) {
        
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = arr.length;
        int cols = arr[0].length;

        printMatrix(arr, rows,cols);
        System.out.println("");

        int ans[][] = transposeMatrix(arr, rows, cols);
        printMatrix(ans, rows, cols);

        System.out.println("");
        transposeInPlace(arr, rows, cols);
        printMatrix(arr, rows,cols);

    }
    
}
