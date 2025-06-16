package javasessions;

public class StudentSheet {

    //WAF: getStudentMarks(String name)
    //return: mark(int)
    //0 to 100
    //student name is not found then return -1

    public int getStudentMarks(String studentName) {

        switch (studentName.toLowerCase().trim()) {
            case "priya":
                return 90;
            case "ravi":
                return 80;
            case "sheeka":
                return 100;
            default:
                System.out.println("Please pass the right student name " + studentName);
                return -1;
        }
    }

    public static void main(String[] args) {
        StudentSheet studentSheet = new StudentSheet();
        int marks = studentSheet.getStudentMarks("sheeka");
        System.out.println(marks);
        if (marks > 0) {
            System.out.println("Marks Sheet : " + marks);
        }

    }
}
