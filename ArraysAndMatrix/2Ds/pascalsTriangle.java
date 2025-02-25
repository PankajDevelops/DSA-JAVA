
public class pascalsTriangle {

    public static void printMatrix(int arr[][]){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }

            System.out.println("");
        }
    }

    public static int[][]pascal(int n ){
        
        int arr[][] = new int[n][];

        for(int i=0; i<n; i++){
            //ith row has 1+1 columns
           arr[i] = new int[i+1];
           //1st an last elemnts of every row is 1
           arr[i][0] = arr[i][i] = 1;

         for(int j=1; j<i; j++){
            arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
          }
          
        }

        return arr;
    }

    public static void main(String[] args) {

        int n = 5; //number of rows

        int ans[][] = pascal(n);
        printMatrix(ans);
        

    }
    
}
