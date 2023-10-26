
import java.util.*;

public class test {

    public static void main(String[] args) {

        char[] arr = {'a','a','a','b','b','c','c','c','c'};
        
        String str = "";
        String st="";
        int count=0;
        
        for(int i=0; i<arr.length; i++){
            char ch = arr[i];
            
            while(arr[i]==arr[i+1] || i<arr.length-1) {
                count++;
            }
            
        if(!str.contains(String.valueOf(ch))){
            st+=ch;
            str+=ch;
            
           }
        }
        
        System.out.print(str);

    }
    
}