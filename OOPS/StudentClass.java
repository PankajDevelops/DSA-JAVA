
public class StudentClass {

    public static void main(String[] args) {

        System.out.println(Student.getNoS());

        Student x = new Student("Canchal", 12, 100);
        System.out.println(x.getNoS());


        Student y = new Student("Pankaj", 12, 100);
        System.out.println(x.getNoS());

        Student z = new Student("Pankaj", 12, 100);
        System.out.println(x.getNoS());

       

    
    }
}
