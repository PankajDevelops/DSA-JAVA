package Mathematics.LEVEL_02;

public class gcdMethod {

    public static int gcd(int a, int b){

        if(b==0) return a;

        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        
        int a = 12;
        int b = 18;

        System.out.println(gcd(a,b));

    }
    
}
