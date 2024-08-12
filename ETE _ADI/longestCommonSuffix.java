
public class longestCommonSuffix {

    public static void main(String[] args) {
        
        String str1 = "ABCDGH";
        String str2 = "ACDGHR";

        // String str1 = "ABC";
        // String str2 = "ACB";

        String str = "";

        for(int i=0; i<str2.length(); i++){
            for(int j=i+1; j<str2.length(); j++){
                if(str1.contains(str2.substring(i,j))){
                    String str3 = str2.substring(i,j);
                    if(str3.length()>str.length()){
                        str=str3;
                    }   
                }
            }
        }

        System.out.println(str.length());

    }
    
}
