// package OOPS;

class Student{

        public int roll;
        public String name;
        public String course;
        public int m1, m2, m3;

        public int total(){
            return m1+m2+m3;
        }

        public int avg(){

            return total()/3;
        }

        public char grade(){
            if(avg()>=60) return 'A';
            else return 'B';
        }

        public String toString(){
            return "Roll No: "+roll+"\n"+"Name: "+name+"\n"+"Course: "+course+"\n";
        }
    }

public class StudentClass {
    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Sunaina";
        s.roll = 1;
        s.course = "CSE";
        s.m1 = 78;
        s.m2 = 68;
        s.m3 = 58;

        System.out.println("Total: "+s.total());
        System.out.println("Avg: "+s.avg());
        System.out.println("Grade: "+s.grade());
        System.out.println("Details\n"+s);


    }
}
