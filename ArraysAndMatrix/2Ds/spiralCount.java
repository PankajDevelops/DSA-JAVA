// package Arrays & 2Ds.2Ds;

public class spiralCount {

    public static void printMatrix(int arr[][]){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }

            System.out.println("");
        }
    }

    public static int[][] generateSpiral(int n){
        int topRow = 0, bottomRow = n-1, leftCol = 0, rigthCol = n-1;

        int arr[][] = new int[n][n];
        int curr = 1;

        while(curr<=n*n){

             //top row -> leftCol to rightCol
            for(int j = leftCol; j<=rigthCol && curr<=n*n; j++){
               arr[topRow][j]=curr++;
            }
            topRow++;

             //rightCol -> top row to bottomRow 
             for(int j=topRow; j<=bottomRow && curr<=n*n; j++){
                arr[j][rigthCol]=curr++;
             }
             rigthCol--;

             //bottomRow -> rightCol to leftCol
             for(int i=rigthCol; i>=leftCol && curr<=n*n; i--){
                arr[bottomRow][i]=curr++;
             }
             bottomRow--;

             //leftCol -> bottoRow to topRow
             for(int i=bottomRow; i>=topRow && curr<=n*n; i--){
                arr[i][leftCol]=curr++;
             }
             leftCol++;
        }

        return arr;
    }

    public static void main(String[] args) {

        int ans[][] =  generateSpiral(4);
        printMatrix(ans);
        


    }
    
}
