package Recursion.RecursionOnStrings;

public class removeOccOfChar {

    public static String removeChar(String str, char ch, int idx){

        if(idx==str.length()) return "";

        String ans = removeChar(str, ch, idx+1);

        char currChar = str.charAt(idx);

        if(currChar!=ch){
            return currChar + ans;
        }

        else{

            return ans;
        }


    }

    public static String removeCharM2(String str){

        if(str.equals("")) return "";

        String ans = removeCharM2(str.substring(1));

        char currChar = str.charAt(0);

        if(currChar!='a'){
            return currChar + ans;
        }

        else{
            
            return ans;
        }


    }

    public static void main(String[] args) {
        
        String str = "abcax";
        char ch = 'a';
        int idx = 0;

        String ans1 = removeChar(str,ch,idx);
        String ans2 = removeCharM2(str);

        System.out.println(ans1);
        System.out.println(ans2);

    }
    
}
