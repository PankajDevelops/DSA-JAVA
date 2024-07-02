public class sumOfDigits {

    public static int sumOfNum(int n){
        if(n==0)return 0;
         
        return n%10+sumOfNum(n/10);   
    }

    public static int countOfDigits(int n){

        if(n<10) return 1;

        return 1+countOfDigits(n/10);

    }

    public static void main(String[] args) {

        int n = 622;
        int x = sumOfNum(n);
        System.out.println(x);

        int y = countOfDigits(n);
        System.out.println(y);

        
    }
    
}
