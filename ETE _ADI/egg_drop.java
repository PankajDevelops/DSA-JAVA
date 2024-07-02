// package ETE _ADI;

public class egg_drop {

    public static int findCriticalFloor(int n, int k) {

        if (k == 1 || k == 0)
            return k;

        if (n == 1)
            return k;

        int min = Integer.MAX_VALUE;

        int x, res;

        for (x = 1; x <= k; x++) {

            res = Math.max(findCriticalFloor(n - 1, x - 1), findCriticalFloor(n, k - x));
            if (res < min) {
                min = res;
            }
        }

        return min + 1;

    }

    public static void main(String[] args) {

        int egg = 4;
        int floor = 3;

        System.out.println(findCriticalFloor(egg, floor));

    }

}
