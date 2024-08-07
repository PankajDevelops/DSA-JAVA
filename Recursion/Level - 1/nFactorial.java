
public class nFactorial {

    public static int nFact(int n) {

        if (n <= 1)
            return 1;

        // int smallAns = nFact(n-1);
        // int ans = n*smallAns;
        // return ans;
        return n * nFact(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        int k = nFact(n);
        System.out.println(k);

    }

}
