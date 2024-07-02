public class fibonaaci{

    public static int findFib(int n){
        
        if(n==0)return 0;
        if(n==1)return 1;

        return findFib(n-1)+findFib(n-2);
    }

    public static void main(String[] args) {

        int n = 4;
        n++;
        System.out.println(findFib(n));
        
    }


}