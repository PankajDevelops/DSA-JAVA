import javax.sound.midi.Soundbank;

public class multipleUptoKth {

    public static void printUptoKth(int n, int k){

        if(k==0)
        return;

        printUptoKth(n,k-1);
        System.out.print(n*k+" ");

    }

    public static int altSign(int n){
         
        if(n==1){
            return 1;
        }

        int even=0; 
        int odd=0;

        if(n%2==0){
            
           return altSign(n-1)-n;
        }

        return odd=altSign(n-1)+n;

    }

    public static void main(String[] args) {
        

        int n = 12;
        int k = 5 ;
   
        // printUptoKth(n, k);
        System.out.println("");
        System.out.println(altSign(5));


    }
    
}
