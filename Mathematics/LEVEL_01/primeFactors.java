package Mathematics.LEVEL_01;

public class primeFactors {

    public static void main(String[] args) {

        int m = 60;

        for (int i = 2; i <=Math.sqrt(m); i++) {

            while (m % i == 0) {
                System.out.print(i + " ");
                m = m / i;
            }
        }

        if (m > 1) {
            System.out.print(m + " ");
        }


    }

}
