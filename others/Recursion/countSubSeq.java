import java.util.*;


public class countSubSeq {

    static void printSeq(String str, String temp, List<String> ls ){

        if(str==""){
            ls.add(temp);
            return;
        }

        String s = str.substring(1);
        char ch = str.charAt(0);

        printSeq(s, temp+ch,ls);
        printSeq(s, temp,ls);

    }

    public static void main(String[] args) {

        String str = "ABCD";
        String K = "BACDBDCD";

        List<String> ls = new ArrayList<>();
        
        printSeq(str, "",ls);

        // for(String s : ls){
        //     if(K.contains(s)){ System.out.println(s.length());
        //     return;}
        // }

        // System.out.println("-1");

    }
    
}
