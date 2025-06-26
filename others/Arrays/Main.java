package DSA.Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        while (T-- > 0) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            
            System.out.println(maxTeamPower(A, N, K));
        }
        
        scanner.close();
    }
    
    private static int maxTeamPower(int[] A, int N, int K) {
        int maxPower = Integer.MIN_VALUE;
        int currentPower = 0;
        
        for (int i = 0; i < K; i++) {
            currentPower += A[i];
        }
        
        maxPower = currentPower;
        
        for (int i = K; i < N; i++) {
            currentPower = currentPower - A[i - K] + A[i];
            maxPower = Math.max(maxPower, currentPower);
        }
        
        return maxPower;
    }
}