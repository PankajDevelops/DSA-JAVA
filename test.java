
public class test {
    public static void main(String[] args) {
        
        int n = 378;
        int m=n;

        for(int i=2; i<=n; i++){

            while(m%i==0){
               System.out.print(i+" ");
               m=m/i;
            
            }
        }
 
    }
}