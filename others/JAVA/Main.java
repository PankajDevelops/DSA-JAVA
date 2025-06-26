// package JAVA;
import java.util.*;

public class Main{

    public static void main(String[] args) {

       int x = 2;
       int y = 9;

       int num = 1;

       while(y!=0){

        if((y&1) != 0){
            num = num * x;
        }

        x = x * x;
        y = y>>1;

    }

    System.out.print(num);

       

       
        
    }


}