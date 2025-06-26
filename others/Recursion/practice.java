import java.util.*;

public class practice {

    public static void rev(String s, String curr){

        if(s.length()==0){
            System.out.print(curr+" ");
            return;
        }

        char c = s.charAt(0);
        String temp = s.substring(1);

        rev(temp, curr+c);
        rev(temp, curr);

    }

    public static void main(String[] args) {

        String input = "1125";

        String str = "abc";

        // for(char c : input.toCharArray()){
        //     char ch = (char)('a'+(c-'1'));
        //     str+=ch;
        // }

        System.out.println(str);

        rev(str,"");

    }
}