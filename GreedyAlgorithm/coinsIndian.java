package GreedyAlgorithm;

public class coinsIndian {

    public static void main(String[] args) {
        
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int n = coins.length;

        int V = 121;
        int count = 0;

        for(int i=n-1; i>=0; i--){
            while(coins[i]<=V){
                V-=coins[i];
                count++;
                System.out.print(coins[i]+" ");
            }
                
        }

        System.out.println("");

        System.out.println(count);

    }
    
}
