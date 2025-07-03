package encapsulation;

public class Employee {

    private String name;
    private int age;
    private double salary;
    private boolean isPerm;
    private double empId;


    /*
     * Encapsulation means hiding the data members using private keyword and giving the access on Public layer
     * private method are cannot accessable outside the class variables
     * public data members and local variables can be accessable using another class
     * To Hide the data members we need to use private keyword and we can access the public method written in the class
     * public methods --> getter and setter
     * It is not mandatory to give setter value, but for update action, we need to use the setter
     * Encapsulation can be achieved for Methods as well, Refer Browser class
     */

    // public constructor is also like a setter
    public Employee(String name, int age, double salary, boolean isPerm, double empId) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isPerm = isPerm;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getEmpId() {
        return empId;
    }

    public void setEmpId(double empId) {
        this.empId = empId;
    }

    public boolean isPerm() {
        return isPerm;
    }

    public void setPerm(boolean perm) {
        isPerm = perm;
    }
}
