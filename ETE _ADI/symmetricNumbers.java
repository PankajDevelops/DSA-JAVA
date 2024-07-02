// package ETE _ADI;

public class symmetricNumbers {

    public static void main(String[] args) {

        int a = 23;
        int b = 900;

        int count = 0;

        for (int i = a; i <= b; i++) {
            if (isSymmetric(i))
                count++;
        }

        System.out.println(count);

    }

    public static boolean isSymmetric(int num) {

    if (num < 10)
    return false;

    int n = 0;
    int temp = num;

    while (temp > 0) {
    n++;
    temp /= 10;
    }

    if (n % 2 != 0)
    return false;

    int sum1 = 0;
    int sum2 = 0;

    for (int i = 0; i < n / 2; i++) {
    sum1 += num % 10;
    num /= 10;
    }

    for (int i = 0; i < n / 2; i++) {
    sum2 += num % 10;
    num /= 10;
    }

    return sum1 == sum2;

    }

    // public static boolean isSymmetric(int num) {
    //     String str = String.valueOf(num);
    //     if (str.length() % 2 != 0) {
    //         return false;
    //     }

    //     int n = str.length() / 2;
    //     int sum1 = 0;
    //     int sum2 = 0;
    //     for (int i = 0; i < n; i++) {
    //         sum1 += Character.getNumericValue(str.charAt(i));
    //         sum2 += Character.getNumericValue(str.charAt(i + n));
    //     }

    //     return sum1 == sum2;
    // }

}
