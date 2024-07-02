public class Seive {
    public static void main(String[] args) {

        int n = 40;
        boolean[] primes =  new boolean[n+1];
        seive(n, primes);

    }
    
    static void seive(int n, boolean[] primes){
        
        for (int i = 2; i * i <= n; i++) {
            if (primes[i]==false) {
                
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true; 
                }
            }
        }

        for (int i = 2; i < primes.length; i++) {
            if (primes[i]==false) {
                System.out.print(i + " " );
            }
        }
    }
}

