// package Arrays & 2Ds.ArrayLists;
import java.util.ArrayList;

import javax.sound.midi.Soundbank;
public class class_01 {

    public static void main(String[] args) {
        
        Integer a = new Integer(1); //Method Depcreated

        Integer b = Integer.valueOf(5);

        System.out.println(a);
        System.out.println(b);


        //--------------------------//

        ArrayList<Integer> l1 = new ArrayList<>();


        // addd new element
        l1.add(2);
        l1.add(4);
        l1.add(6);
        l1.add(8);

        //printing elements
        System.out.println(l1.get(0));
        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i)+" ");
        }

        //printing directly
        System.out.println(l1);

        //adding element at specific index
        l1.add(1,990);
        System.out.println(l1);

        //modifying element at index i
        l1.set(1,789);
        System.out.println(l1);

        //removing element at index i
        l1.remove(1);
        System.out.println(l1);

        //remove elemnt value
        l1.remove(Integer.valueOf(4));
        System.out.println(l1);

        //element exists
        boolean ans = l1.remove(Integer.valueOf(6));
        System.out.println(ans);

        //if you don't specify class, you can put anything insisde l1

        ArrayList l = new ArrayList<>();
        l.add("string");
        l.add(45);
        l.add(true);
        System.out.println(l);


    }
    
}
