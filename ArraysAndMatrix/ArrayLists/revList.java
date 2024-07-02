// package Arrays & 2Ds.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class revList {

    static void reverseList(ArrayList<Integer>list){
        int i=0; int j=list.size()-1;

        while(i<j){
            int temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(0);
        arr.add(10);
        arr.add(3);
        arr.add(5);
        arr.add(22);
        arr.add(10);

        System.out.println(arr);

        // for(int i=arr.size()-1; i>=0; i--){
        //     System.out.print(arr.get(i)+" ");
        // }
        Collections.reverse(arr);
        System.out.println(arr);
        // reverseList(arr);


        Collections.sort(arr);
        System.out.println("Acending Order "+arr);
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println("Decending Order "+arr);


        ArrayList<String> str = new ArrayList<>();

        str.add("welcome");
        str.add("to");
        str.add("coding");
        str.add("world");

        System.out.println(str);
        Collections.sort(str);
        System.out.println(str);



    }
    
}
