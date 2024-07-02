import java.util.*;

class rectangularSum{

    public static void findPrefixSumMatrix(int[][] matrix){
//Approach - 03

        int r = matrix.length;
        int c = matrix[0].length;
//traverse horizontally to calculate row wise prefix sum

        for(int i=0; i<r; i++){
            for(int j = 1; j<c; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

//traverse vertically to calculate row wise prefix sum

        for(int j = 0; j<c; j++){
            for(int i=1; i<r; i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }       

    }

    public static int findSum3(int[][] matrix, int l1, int r1, int l2, int r2){
        int ans = 0;
        int sum = 0, up=0, left=0, leftUp=0;

        findPrefixSumMatrix(matrix);

        sum = matrix[l2][r2];
        if(r1>=1)
        left = matrix[l2][r1-1];
        if(l1>=1)
        up = matrix[l1-1][r2];
        if(l1>=1 && r1>=1)
        leftUp = matrix[l1-1][r1-1];

        ans = sum - up - left + leftUp;

        return ans;
    }
    public static void main(String[] args) {

        int arr[][] = {{1,2,3},{4,1,1},{1,1,1}};

        int l1 = 0;
        int r1= 0;
        
        int l2 =2;
        int r2=2;

        System.out.println(findSum3(arr, l1, r1, l2, r2));

        
    }
}