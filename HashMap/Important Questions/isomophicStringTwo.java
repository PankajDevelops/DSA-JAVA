// package HashMap.Important Questions;

import java.util.*;
public class isomophicStringTwo {


    public static boolean isPatternMatch(String str1, String str2){

    int n = str1.length();

    String str[] = str2.split(" ");

    Map<Character,String> mp = new HashMap<>();

    for(int i=0; i<n; i++){

        char ch1 = str1.charAt(i);
        String str3 = str[i];

        if(mp.containsKey(ch1)){

            if(!mp.get(ch1).equals(str3)){
                return false;
            }

        }
        else if(mp.containsValue(str3)){
            return false;

        }
        else{
            mp.put(ch1,str3);
        }

      }

       return true;
    }

    public static void main(String[] args) {

    String str1 = "abba";
    String str2 = "dog cat cat dog";

    System.out.println(isPatternMatch(str1, str2));
   

        
    }
    
}

