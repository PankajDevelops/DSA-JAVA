// package Mathematics.LEVEL_02;

import java.util.*;

import java.util.Scanner;

public class isStraightLine {

    public static String checkStraightLine(int[][] points) {

        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];

        int a = y2 - y1;
        int b = x1 - x2;
        int c = a * (x1) + b * (y1);

        for (int i = 2; i < points.length; i++) {

            int x = points[i][0], y = points[i][1];

            if (a * x + b * y != c) {
                return "0";
            }

        }

        return a + "x " + (b >= 0 ? "+ " : "- ") + Math.abs(b) + "y = 0";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        String result = checkStraightLine(points);
        System.out.println(result);

    }
}
