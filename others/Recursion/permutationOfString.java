import java.util.*;

public class permutationOfString {

    static List<String> ls = new ArrayList<>();

    public static void isPerm(String str, String ans){

        if(str.length()==0){
            ls.add(ans);
            return;
        }

        for(int i=0; i<str.length(); i++){

            char ch = str.charAt(i);

            String left = str.substring(0,i);
            String right = str.substring(i+1);

            String rem = left + right;

             isPerm(rem,ans+ch);
        }

    }

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "ccccbbbbaaaa";

        ls.clear();
        isPerm(s1,"");

        System.out.println(ls);
        
    }
    
}
