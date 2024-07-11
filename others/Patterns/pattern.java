package others.Patterns;

public class pattern {

    public static void printPattern(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 3; j++) {

                if (i % j == 0 && j == 2)
                    System.out.print("*");

                else if (i % 4 == 1 && j == 1)
                    System.out.print("*");

                else if (i % 4 == 3 && j == 3)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }

            System.out.println(" ");
        }
    }

    public static void main(String[] args) {

        int n = 5;

        printPattern(n);

    }

}
