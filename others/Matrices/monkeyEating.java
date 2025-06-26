package Matrices;

import java.util.Scanner;

public class monkeyEating {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt(); // Total number of Monkeys
        int k = sc.nextInt(); // Bananas a Monkey can eat
        int j = sc.nextInt(); // Peanuts a Monkey can eat
        int m = sc.nextInt(); // Total number of Bananas
        int p = sc.nextInt(); // Total number of Peanuts

        if (n <= 0 || k <= 0 || j <= 0 || m < 0 || p < 0) {
            System.out.println("INVALID INPUT");
            return;
        }

        int monkeysLeft = n;

        int monkeysEatingBananas = Math.min(m / k, n);

        monkeysLeft -= monkeysEatingBananas;
        m -= monkeysEatingBananas * k;

        int monkeysEatingPeanuts = Math.min(p / j, monkeysLeft);

        monkeysLeft -= monkeysEatingPeanuts;
        p -= monkeysEatingPeanuts * j;

        if (monkeysLeft > 0 && (m > 0 || p > 0)) {
            monkeysLeft--;
        }

        System.out.println("Number of Monkeys left on the Tree:" + monkeysLeft);
    }
}

