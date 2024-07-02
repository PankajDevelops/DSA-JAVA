package Strings;

public class maxOccuringChar {

    public static void main(String[] args) {
        
        String str = "testsample";

        int[] arr = new int[26];

        for(int i=0; i<str.length(); i++){

            char ch = str.charAt(i);
            int k = ch-'a';
            arr[k]++;

        }

        int max = -1;
        int ans = 0;

       for(int i=0; i<arr.length; i++){
        if(max<arr[i]){
            ans = i;
            max = arr[i];
          }
       }

       char ch = (char) ('a'+ans);

       System.out.println(ch);

    }
    
}
