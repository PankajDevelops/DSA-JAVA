import java.util.*;
public class fraction {

     public static Fraction add(Fraction f1, Fraction f2 ){
        int numerator = f1.num*f1.den+f1.den*f2.num;
        int denamerator = f1.den*f2.den;

        Fraction f3 = new Fraction(numerator, denamerator);
        return f3;

     }
     public static Fraction multiply(Fraction f1, Fraction f2 ){
        int numerator = f1.num*f2.num;
        int denamerator = f1.den*f2.den;

        Fraction f3 = new Fraction(numerator, denamerator);
        return f3;
        
     }

            public static int gcd(int num, int den){

            int min = Math.min(num,den);
            for(int i=min; i>=1; i--){
                if(num%i==0 && den%i ==0){
                    return i;
                }

            }
            return min;


        }

    public static class Fraction{
        int num;
        int den;

        //constructor name is same as the parent class name
        public  Fraction(int num, int den){
            this.num=num;
            this.den=den;
            simplify();
        }


        public void simplify(){
            int hcf = gcd(num,den);
            num/=hcf;
            den/=hcf;

        }
    }

    public static void main(String[] args) {

        Fraction f1 = new Fraction(35,21);
        System.out.println(f1.num+"/"+f1.den);

        Fraction f1 = new Fraction(35,21);
        System.out.println(f1.num+"/"+f1.den);

        
        System.out.println(f1.num+"/"+f1.den);

        // Fraction f2 = new Fraction(45,56);
        // System.out.println(f2.num+"/"+f2.den);
        
    }
    
}
