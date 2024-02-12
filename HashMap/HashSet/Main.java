package HashMap.HashSet;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Set<String> st = new HashSet<>();

        st.add("Raikwar");
        st.add("Pankaj");
        System.out.println(st);
        System.out.println(st.contains("Raikwar"));
        System.out.println(st.size());

        st.remove("Raikwar");
        System.out.println(st.contains("Raikwar"));
        System.out.println(st.size());

        for(String s : st){
            System.out.println(s);
        }

    }
    
}
