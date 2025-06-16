package constructorconcept;

public class Employee {

    String name;
    int age;
    double salary;
    String dob;
    char gender;
    static int w;


    /*
     * Constructor name is same as class name
     * This looks like a function but its not a function
     * There is no return type for Constructor(no void, no int)
     * Avoid business Logic in the constructor
     * Main purpose of the Constructor is used to initialize the class or instance variables with the help of local variables using this keyword
     * Constructor can be overloaded
     * Constructor will be having 0 parameters then it will be default constructor
     * Constructor will be called when we create the object of the class
     * Constructor will help to restrict the object creation unnecessary
     * One Default or hidden constructor will be added at the run time by JVM
     * Suppose if u have constructor created, then Java will not add the hidden constructor
     */

   /*  public Employee() {
        System.out.println("This is the default Constructor");
    }

   public Employee(int a) {
        System.out.println("This is one param Constructor " + a);
    }

    public Employee(double a) {
        System.out.println("This is one param Constructor " + a);
    }*/
    public Employee(String name, int age, double salary, String dob) {
        //this.Global Var = Local Var
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dob = dob;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, int age, double salary, String dob, char gender) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dob = dob;
        this.gender = gender;
    }

    public Employee(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Priya", 30);
        System.out.println(e1.name + " " + e1.age);

        Employee e2 = new Employee("Deveesh", 25, 30.66, "");
        System.out.println(e2.name + " " + e2.age + " " + e2.salary + " " + e2.dob);

        Employee e3 = new Employee("Raghu", 25, 'M');
        System.out.println(e3.name + " " + e3.age + " " + e3.gender);

        Employee e4 = new Employee("Naveen", 25, 30.22, "30-JAN-1995", 'M');
        System.out.println(e4.name + " " + e4.age + " " + e4.salary + " " + e4.dob + " " + e4.gender);

    }
}
