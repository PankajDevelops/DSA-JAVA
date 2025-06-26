package Company.Accenture;

public class reverseInteger {

    public static void main(String[] args) {
        
        int x = 123;
        int ans = 0;

        while(x!=0){
            int digit = x%10;
            if(ans>Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10) break;
            ans = ans*10+digit;
            x=x/10;
        }

        System.out.println(ans);

    }
    
}
