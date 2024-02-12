import java.util.*;

class stackBasics{

    public static void main(String[] args) {

        Stack<Integer> sc = new Stack <>();

        System.out.println(sc.isEmpty());

        sc.push(93);
        sc.push(94);
        sc.push(95);
        sc.push(96);

        System.out.println(sc);
        System.out.println(sc.peek());
        System.out.println(sc.pop());
        System.out.println(sc.size());

        while(sc.size()>1){
            sc.pop();
        }

        System.out.println(sc);
        
        
    }
}