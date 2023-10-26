
public class Student {
     String name;
      int rno;
    double percent;
    final String schoolName = "Canton";
    private static int noOfStudents;

    public Student(String name, int rno, int percent) {
        this.name = name;
        this.rno = rno;
        this.percent = percent;
        noOfStudents++;
    }

    public static int getNoS(){
        return noOfStudents;
    }

    public void setRno(int rno){
       this.rno=rno;
    }
}
