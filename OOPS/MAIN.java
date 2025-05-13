import java.util.*;
import java.lang.*;
import java.io.*;

class ATM {

    int Balance = 1200;
    int PIN = 5674;
    Scanner sc;

    public ATM(Scanner scanner) {
        this.sc = scanner;
    }

    public void checkPin(int n) {

        if (n == PIN) {
            menu();
        } else {
            System.out.println(" Wrong PIN !!! ");
        }
    }

    void menu() {

        System.out.println(" Press '4' For Check Balance ");
        System.out.println(" Press '5' For Withdraw Balance ");
        System.out.println(" Press '6' For Deposit MENU ");

        int x = sc.nextInt();

        if (x == 4)
            getBal();
        else if (x == 5) {
            System.out.print(" Enter Balance: ");
            int w = sc.nextInt();
            withDraw(w);
        } else if (x == 6) {
            System.out.print(" Enter Balance: ");
            int w = sc.nextInt();
            depositBal(w);
        }

    }

    void getBal() {
        System.out.println("Your Balance is: " + Balance);
    }

    void withDraw(int n) {
        System.out.println("Successfully Withdrawn !!!");
        System.out.println("Your Balance is: " + (Balance - n));
    }

    void depositBal(int n) {
        System.out.println("Successfully Deposited !!!");
        System.out.println("Your Balance is: " + (Balance + n));
    }

}

public class MAIN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("   WELCOME TO ATM !!!       ");
        System.out.println(" Press '1' For Main MENU ");
        System.out.println(" Press '2' For Exit ");

        System.out.println(" ");

        int n = sc.nextInt();

        if (n == 1) {
            ATM a1 = new ATM(sc);
            System.out.println(" Enter your PIN ");
            int x = sc.nextInt();
            a1.checkPin(x);
        } else if (n == 2)
            System.out.println(" You have Successfully Exited !!! ");
        else {
            System.out.println(" Wrong Input !!! ");
        }

    }
}
