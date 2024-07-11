import java.util.*;

public class sampleQues {

    public static void main(String[] args) {

        String str = "ABAB";
        int n = str.length();
        int k = 2;

        Map<Character, Integer> mp = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            } else {
                mp.put(c, 1);
            }
        }

        int maxFreq = 0;
        for(int num: mp.values()){
            if(maxFreq<num){
                maxFreq = num;
            }

        }

        int[] arr = new int[128];

        for (char c : str.toCharArray()) {
            arr[c]++;
        }

         maxFreq = 0;

        for(int num: arr){
            if(maxFreq<num){
                maxFreq=num;
            }
        }

        System.out.println(maxFreq+k);
        
    }
    
}
