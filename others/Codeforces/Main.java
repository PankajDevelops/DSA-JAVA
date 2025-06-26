
import java.util.*;

class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        

        while(t-->0){

            int a = sc.nextInt();

            int arr[] = new int[a];
            int ans = 0;

            for(int i=0; i<a; i++){
                arr[i] = sc.nextInt();
            }

            for(int i=0; i<arr.length; i++){

                if(i%2==0){
                    ans+=arr[i];
                }
                else{
                    ans-=arr[i];
                }

            }

            System.out.println(ans);
        }

        

        

        

    }
    
}
