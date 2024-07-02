package Recursion;

public class test {

    static int printNum(int n){
        
        if(n==0) return 0;
        if(n==1) return 1;

        return printNum(n-1)+printNum(n-2);

    }

    public static void main(String[] args) {

        // 0,1,1,2,3,5,8,13,21

        int n = 5;

        System.out.println(printNum(n));
        


    }
    
}
