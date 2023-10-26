public class fibonaaci{

    public static int findFib(int n){
        if(n==0)return 0;
        if(n==1)return 1;

        // int fib1=findFib(n-1);
        // int fib2=findFib(n-2);
        // int ans = fib1+fib2;
        // return ans;

        return findFib(n-1)+findFib(n-2);
    }

    public static void main(String[] args) {

        int n = 9;
       for(int i=0; i<=n; i++){
        System.out.print(findFib(i)+" ");
       }
        
    }


}