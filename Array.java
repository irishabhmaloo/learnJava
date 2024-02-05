
class Student {
    int rollno;
    String name;
}

public class Array {
    public static void main(String ar[]) {

        Student s1 = new Student();
        s1.rollno = 101;
        s1.name = "Sonoo";

        Student s2 = new Student();
        s1.rollno = 102;
        s1.name = "Sonoo";

        Student s3 = new Student();
        s1.rollno = 103;
        s1.name = "Sonoo";
        
        // creating array that will can store object:
        // it has not created objects, you have to do it:
        Student std[] = new Student[3];

        std[0] = s1;
        std[1] = s2;
        std[2] = s3;
    }
}