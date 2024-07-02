// package ETE _ADI;

import java.util.*;

public class wordDictonary {

    /*
     * Example:-
     * Sample Input 1
     * applepie
     * 5
     * apple
     * pie
     * applep
     * ap
     * P
     * Sample Output 1
     * Yes
     * Sample Input 2
     * cars
     * 1
     * car
     * Sample Output 2
     * No
     * 
     */

     public static boolean isBuild(String str, List<String> ls) {

        if (str.isEmpty())
            return true;

        int n = ls.size();

        for (int i = 1; i <= n; i++) {

            String prefix = str.substring(0, i);
            if (ls.contains(prefix) && isBuild(str.substring(i), ls)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> ls = new ArrayList<>();

        String str  = sc.next();
        int n = sc.nextInt();

       for(int i=0; i<n; i++){
        ls.add(sc.next());
       }
       
        boolean flag = isBuild(str,ls);

        System.out.println(flag);
        


    }
    
}
