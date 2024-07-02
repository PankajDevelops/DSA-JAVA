package OOPS.Polymorphism;

class Data {

    int data;
}

public class poly {

    public static void main(String[] args) {

        Integer a = 90;

        Data obj = new Data();

        obj.data = 91;
        changeValue(a, obj);
        
        System.out.println(a);
        System.out.println(obj.data);

    }

    static void changeValue(int a, Data obj) {
        a = 10;
        obj.data = 124;
    }

}
