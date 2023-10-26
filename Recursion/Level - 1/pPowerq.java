public class pPowerq {

    public static int powerOfpq(int p, int q){

        // if(p==0)return 0;
        // if(q==0)return 1;

        // return p*powerOfpq(p,q-1);

        if(q==0)return 1;
        if(q%2==0){
            int smallPow = powerOfpq(p, q/2);
            return smallPow*smallPow;
        }
        
        int powSmall = powerOfpq(p, q/2);
        return p * powSmall*powSmall;

        }


    public static void main(String[] args) {
        
        int p = 2;
        int q = 3;

        int ans = powerOfpq(p, q);
        System.out.println(ans);



    }
    
}
