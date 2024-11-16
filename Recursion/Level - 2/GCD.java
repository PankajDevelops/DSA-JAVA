
public class GCD {

    public static int gcdOfNums(int x, int y){

        while(x%y!=0){
            int rem = x%y;
            x=y;
            y=rem;
        }
        
        return y;
    }

    public static int gcdEuclid(int x, int y){
        
        if(y==0){
            return x;
        }

        return gcdEuclid(y, x%y);
    }

    public static void main(String[] args) {

        int a = 24;
        int b = 15;

        int c = 4;
        int d = 6;

        int ans = gcdOfNums(a,b);
        System.out.println(ans);

        int ansnew = gcdOfNums(c,d);
        System.out.println(ansnew);
        
    }
    
}
//added a COMMENT