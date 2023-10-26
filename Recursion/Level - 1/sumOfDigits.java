public class sumOfDigits {

    public static int sumOfNum(int n){
        if(n==0)return 0;
        return n%10+sumOfNum(n/10);
        
    }


    public static void main(String[] args) {

        int n = 6;
        int x = sumOfNum(n);
        System.out.println(x);

        
    }
    
}
