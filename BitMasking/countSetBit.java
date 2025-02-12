package BitMasking;
import java.util.Scanner;

public class countSetBit {

    public static int countSetBit(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {

        int n = 5;
        int finalCount = 0;

        for (int i = 1; i <= n; i++) {

            finalCount += countSetBit(i);

        }
        System.out.println(finalCount);

    }

}
