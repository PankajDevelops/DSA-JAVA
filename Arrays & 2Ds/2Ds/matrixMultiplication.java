// package Arrays & 2Ds.2Ds;

public class matrixMultiplication {

     public static void print2D(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void multiplyMatrix(int arr1[][],int r1, int c1, int arr2[][], int r2, int c2){

        if(c1!=r2){
            System.out.println("Wrong Input");
            return;
        }

        int mul[][] = new int[r1][c2];

        for(int i=0; i<r1; i++){
            for(int j = 0; j<c2; j++){
                for(int k = 0; k<c1; k++){
                    mul[i][j]+=(arr1[i][k]*arr2[k][j]);
                }
            }
        }

        print2D(mul,r1,c2);


    }

    public static void main(String[] args) {

        int arr1[][] = {{1,2,3,4},{3,1,4,2}}; //2r x 4c
        int arr2[][] = {{1,4,5},{3,1,6},{2,3,8},{1,4,9}}; //4r x 3c

        //final matrix 3c x 2r

        int r1=arr1.length;//2r
        int c1 = arr1[0].length;//3c

        int r2=arr2.length; //4r
        int c2 = arr2[0].length; //3c

        multiplyMatrix(arr1, r1, c1, arr2, r2, c2);

        
         
        
    }
    
}
