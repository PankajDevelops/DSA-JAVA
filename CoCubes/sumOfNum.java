package CoCubes;


// Find lcm of three numbers 2 3 4 output 12.


public class sumOfNum {

    public static int gcd(int x, int y){

        if(y==0) return x;

        return gcd(y,x%y);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        
        int a = 2;
        int b = 3;
        int c = 4;

        int temp = lcm(a,b);
        int ans = lcm(temp,c);

        System.out.println(ans);


    }
    
}
