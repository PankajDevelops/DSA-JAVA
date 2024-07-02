package OOPS.practiceQuestions;

import java.util.*;

class ComplexNumber{

    int real;
    int img;

    public ComplexNumber(int real, int img){
        this.real = real;
        this.img = img;
    }

    public void print(){
        System.out.println(real+" + i"+img);
    }

    void plus(ComplexNumber c){
        this.real +=c.real;
        this.img += c.img;
    }

    void multiply(ComplexNumber c) {
        int newReal = this.real * c.real - this.img * c.img;
        int newimg = this.real * c.img + this.img * c.real;
        this.real = newReal;
        this.img = newimg;
    }
}



public class complexNumberClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();

        int operation = sc.nextInt();

        ComplexNumber num1 = new ComplexNumber(a, b);
        ComplexNumber num2 = new ComplexNumber(c, d);

        if (operation == 1) {
            num1.plus(num2);
        } else if (operation == 2) {
            num1.multiply(num2);
        } else {
            return;
        }

        num1.print();
        

    }
    
}
