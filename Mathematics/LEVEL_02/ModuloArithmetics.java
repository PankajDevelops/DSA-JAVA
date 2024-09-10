// package Maths.LEVEL_02;

public class ModuloArithmetics {

    public static void main(String[] args) {

        int a = 10;
        int b = 2;

        int ans = 1;

        while (b > 0) {

            if ((b & 1) != 0) {
                ans *= a;
            }

            a = a * a;
            b = b >> 1;
        }

        System.out.println(ans);

    }

}
