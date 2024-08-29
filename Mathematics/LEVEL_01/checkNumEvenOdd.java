package Mathematics.LEVEL_01;

public class checkNumEvenOdd {

    public static void main(String[] args) {

        /*
         * Check the number is odd or even without using loop and mudlo operator
         * no any mathematical operation
         */

        int num = 16;

        if ((num & 1) == 1)
            System.out.println("ODD");
        else
            System.out.println("even");

    }

}
