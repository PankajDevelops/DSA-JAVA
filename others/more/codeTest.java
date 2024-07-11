import java.util.*;

public class codeTest {

    public static double maximizeValue(int weightLimit) {

        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};

        int n = values.length;
        double totalValue = 0.0;

        double[] valuePerWeight = new double[n];
        for (int i = 0; i < n; i++) {
            valuePerWeight[i] = (double) values[i] / weights[i];
        }

        for (int i = 0; i < n; i++) {
            if (weightLimit >= weights[i]) {
                totalValue += values[i];
                weightLimit -= weights[i];
            } else {
                totalValue += valuePerWeight[i] * weightLimit;
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {

        int weightLimit = 50;

        double maxValue = maximizeValue(weightLimit);
        System.out.println(maxValue);

    }
    
}
