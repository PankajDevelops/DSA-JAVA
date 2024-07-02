import java.util.*;

public class rectangleSum {

//-----------------------------Approach = 01--------------------------------
    public static int findSum (int arr[][], int l1, int r1, int l2, int r2){

        int sum = 0;

        for(int i=l1; i<=l2; i++){
            for(int j=r1; j<=r2; j++){
                sum+=arr[i][j];
            }
        }

        return sum;

    }

    //-------------------------Approach = 02------------------------------
    public static void findPrefixSumMatrix(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;

        for(int i=0; i<r; i++){
            for(int j=1; j<c; j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
    }

    public static int findSum2(int arr[][], int l1, int r1, int l2, int r2){

        int sum = 0;

        findPrefixSumMatrix(arr);

        for(int i=l1; i<=l2; i++){

            if(r1>=1)
            sum+=arr[i][r2] - arr[i][r1-1];

            else
            sum+=arr[i][r2];
        }

        return sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number rows & columns");

        int r = sc.nextInt();
        int c = sc.nextInt();

        int matrix[][] = new int[r][c];
        int totalElements = r*c;
        System.out.println("Enter "+totalElements+" values:");
       for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }

        }

        System.out.println("Enter rectangle boundaries L1, R1 AND L2, R2");

        int l1= sc.nextInt();
        int r1= sc.nextInt();
        int l2= sc.nextInt();
        int r2= sc.nextInt();

        System.out.println("Rectangle Sum " + findSum(matrix,l1,r1,l2,r2));
        System.out.println("Rectangle Sum " + findSum2(matrix,l1,r1,l2,r2));
    }
    
}
