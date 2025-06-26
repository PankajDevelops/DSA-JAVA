package Strings;


public class zigZag {

   public static void main(String[] args) {
    
     String s = "PAYPALISHIRING";
    int n = 3;

    String ans = "";
        
        while(n!=0){
            for(int i=0; i<n;i++){
                ans+=s.charAt(i);
            }
            System.out.print(ans+" ");
            n--;
        }

        

   }

        
    
}
