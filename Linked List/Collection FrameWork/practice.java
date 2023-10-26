import java.util.*;

public class practice {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int arr1[]=new int[x];
        int arr2[]=new int[y];
        int arr3[]=new int[z];

        for(int i=0; i<x; i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0; i<y; i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0; i<z; i++){
            arr3[i]=sc.nextInt();
        }

        int target = sc.nextInt();

        for(int i=0; i<x; i++){
            for(int j=0; j<y;j++){
                for(int k=0; k<z; k++ ){
                    if(arr1[i]+arr2[j]+arr3[k]==target){
                        System.out.println(arr1[i]+" "+arr2[j]+" "+arr3[k]);
                    }

                }
            }
        }



        




    }
    
}
