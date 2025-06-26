package Arrays;

public class twoSUM {

    public static void main(String[] args) {
        
        String s= "abcabcbb";
        String temp = "";
        int ans = 0;

        for(int i=0; i<s.length(); i++){

            for(int j = i; j<s.length(); j++){
                
                char ch = s.charAt(j);
                if(!temp.contains(String.valueOf(ch))){
                    temp+=ch;
                }
                else{
                    // ans = Math.max(ans,temp.length());
                    System.out.print(temp+" ");
                    temp = "";
                    break;
                }
            } 
        }

        System.out.println(ans);
    }
    
}
