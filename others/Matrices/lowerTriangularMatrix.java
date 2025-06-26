package Matrices;

class lowerTriangularMatrix{

    static void print(int arr[][]){

        int m = arr[0].length;
        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }

            System.out.println("");
        }
    }

    static void makeLowerTmatrix(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j > i) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        print(arr);
        System.out.println("");
        makeLowerTmatrix(arr);
        System.out.println("");
        print(arr);

    }
}