package Mathematics.LEVEL_01;

public class factor {

    public static void main(String[] args) {

        int n = 60;

        for (int i = 1; i < Math.sqrt(n); i++) {

            if (n % i == 0) {
                System.out.print((i) + " ");
            }
        }

        for (int i = (int) Math.sqrt(n); i >= 1; i--) {

            if (n % i == 0) {
                if (i != n/i) {
                    System.out.print((n / i) + " ");
                }
            }
        }

    }

}
