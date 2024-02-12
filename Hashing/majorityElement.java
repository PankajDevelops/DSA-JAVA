import java.util.*;

public class majorityElement {
    public static void main(String[] args) {
        
        int[] arr = {10, 5, 10, 15, 10, 15};
        int n = arr.length;
        

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        Set<Integer> keySet = map.keySet();

        int countMax = 1;
        int countMin = 1;

        for(Integer key : keySet){
            if(map.get(key)>countMax){
                countMax = map.get(key);
            }
            else{
                countMin = map.get(key);
            }
        }

      System.out.println(countMax);
      System.out.println(countMin);

    }
    
}
