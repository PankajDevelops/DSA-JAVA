// package Arrays & 2Ds.2Ds;

public class spiralMatrix {

    public static void printMatrix(int arr[][]){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }

            System.out.println("");
        }
    }

    public static void spiral(int arr[][], int r, int c){
        int topRow = 0, bottomRow = r-1, leftCol = 0, rigthCol = c-1;
        int totalElements = 0;

        while(totalElements<r*c){

             //top row -> leftCol to rightCol
            for(int j = leftCol; j<=rigthCol && totalElements<r*c; j++){
                System.out.print(arr[topRow][j]+" ");
                totalElements++;
            }
            topRow++;

             //rightCol -> top row to bottomRow 
             for(int j=topRow; j<=bottomRow && totalElements<r*c; j++){
                System.out.print(arr[j][rigthCol]+" ");
                totalElements++;
             }
             rigthCol--;

             //bottomRow -> rightCol to leftCol
             for(int i=rigthCol; i>=leftCol && totalElements<r*c; i--){
                System.out.print(arr[bottomRow][i]+" ");
                totalElements++;
             }
             bottomRow--;

             //leftCol -> bottoRow to topRow
             for(int i=bottomRow; i>=topRow && totalElements<r*c; i--){
                System.out.print(arr[i][leftCol]+" ");
                totalElements++;
             }
             leftCol++;
        }
    }

    public static void main(String[] args) {

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}}; 

        printMatrix(arr);
        System.out.println("");
        spiral(arr, 3, 3);
        


    }
    
}
