package BinarySearch;

public class sqrt {

    public static int binaryS(int n) {

        int s = 0;
        int e = n;

        int mid = s + (e - s) / 2;

        while (s <= e) {
            int temp = mid * mid;
            if (temp == n) {
                return mid;
            } else if (temp > n) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

            mid = s + (e - s) / 2;
        }

        return -1;
    }

    public static void main(String[] args) {

        int n = 6;

        System.out.println(binaryS(n));

    }

}
