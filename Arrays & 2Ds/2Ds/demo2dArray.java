// package Arrays & 2Ds.2Ds;

public class demo2dArray {

    public static void print2d(int arr[][], int x, int y){

        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                System.out.print(arr[i][j]+" ");
            }

            System.out.println("");
        }

    }

    public static void main(String[] args) {
        
        int arr[][]  = new int[3][4];

        arr[0][0]=11;
        arr[0][1]=12;
        arr[0][2]=13;
        arr[0][3]=14;

        arr[1][0]=15;
        arr[1][1]=16;
        arr[1][2]=17;
        arr[1][3]=18;

        arr[2][0]=21;
        arr[2][1]=22;
        arr[2][2]=23;
        arr[2][3]=24;

        print2d(arr, 3, 4);

        int arr2[][] = {{1,2,3},{2,3,4},{5,6,7}};

        print2d(arr2, 3, 3);





    }
    
}
