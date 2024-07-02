// package Recursion.Level - 0;

public class stringPlaindrome {

    public static boolean isPalindrom1 (String str){

        if(str.length()==0 || str.length()==1){
            return true;
        }

         if(str.charAt(0)==str.charAt(str.length()-1)){
            return isPalindrom1(str.substring(1, str.length()-1));
        }

        return false;
    }

    public static boolean isPalindrom2(String s, int l, int r){

        if(l>=r){
            return true;
        }

         return (s.charAt(l)) == s.charAt(r) && isPalindrom2(s, l+1, r-1);
    }

     public static String rev (String str){
        
        if(str.equals("")) return "";
        
        return rev(str.substring(1))+str.charAt(0);
    }

   public static void main(String[] args) {

    String str = "niggaaggin";
    
    Boolean bool1 = isPalindrom1(str);

    int l = 0; int r = str.length()-1;
    Boolean bool2 = isPalindrom2(str,l,r);

    System.out.println(bool1); //m1
    System.out.println(bool2); //m2
    System.out.println(rev(str).equals(str)); //m3

    


   }

    
}
