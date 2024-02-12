import java.util.*;
public class validAnagram {

    public static void main(String[] args) {

        String str1= "rat";
        String str2= "cat";

        Map<Character,Integer> mp1 = new HashMap<>();

        for(char c : str1.toCharArray()){

            if(!mp1.containsKey(c)){
                mp1.put(c,1);

            }
            else{
                mp1.put(c,mp1.get(c)+1);
            }

        }

        Map<Character,Integer> mp2 = new HashMap<>();

        for(char c : str2.toCharArray()){

            if(!mp2.containsKey(c)){
                mp2.put(c,1);

            }
            else{
                mp2.put(c,mp2.get(c)+1);
            }

        }

        if(mp1.equals(mp2)){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }



        


    }
    
}
