// package ETE _ADI;

public class coin_change {

    public  static int helper(int amount, int coins[], int idx){

        if(amount==0) return 1;

        if(amount<0 || idx==coins.length) return 0;

        int result = 0;

        for(int i=idx; i<coins.length; i++){
            if(amount>=coins[i]){
                result+=helper(amount-coins[i], coins, i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        int arr[] ={1,2,5,10};
        int n = arr.length;

        int k = 12;

        System.out.println(helper(k,arr,0));



    }
    
}
