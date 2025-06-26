package Matrices;
import java.util.*;

public class SweetSeventeen {

    public static void main(String[] args) {
        
        String str = "23GF".toLowerCase();

        Map<Character,Integer> mp = new HashMap<>();

        char c = 'a';
        for(int i=0; i<=17; i++){

            char ch = (char) (i+'0');
            
            if(i<=9){
                mp.put(ch,i);
            }
            
            else{
                mp.put(c,i);
                c++;
            }
            
        }

        int ans = 0;
        int count = 0;

        for(int i=str.length()-1; i>=0; i--){
            ans = ans + (int)Math.pow(17, count++)*mp.get(str.charAt(i));
        }

        System.out.println(ans);



    }
    
}
