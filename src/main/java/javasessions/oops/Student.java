package javasessions.oops;

public class Student {

    String name;
    int age;
    String subject[];

    public static void main(String[] args) {

        Student student = new Student();
        student.name="Naveen";
        student.age = 23;

        student.subject = new String[5];

        student.subject[0] = "Java";
        student.subject[1] = "Python";
        student.subject[2] = "Ruby";

    }
}
