
public class stringRev {

    public static String rev (String str){
        
        if(str.equals("")) return "";
        
        return rev(str.substring(1))+str.charAt(0);
    }

   public static void main(String[] args) {

    String testString = "Hello";
    System.out.println(rev(testString));


   }

    
}
