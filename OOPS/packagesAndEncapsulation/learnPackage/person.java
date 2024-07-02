package OOPS.packagesAndEncapsulation.learnPackage;

public class person {

    private int age;
    private String name;

    public static int count = 10;

    boolean canSetAge = false;

    public void setAge(int age){

        if(canSetAge)
            this.age = age;
    }
    
    public int getAge(){
        return age;
    }

}
