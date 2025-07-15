package javasessions.oops;

public class Employee {

    /*
     * Class: Category/template/blueprint
     * Object: is a physical Entity created from the class
     * <p>
     * Employee is a class it will be having id, name, age
     */

    // Class Variables// Instance / Template Variables /Global Variable
    String name;
    int age;
    double salary;
    boolean isPerm;
    char gender;

    public static void main(String[] args) {

        int i = 10; // Local Variable

        // Create the Object using new Keyword

        Employee obj = new Employee();
        // obj --> obj is the object reference name
        // new Employee();  --> This is the Object/Instance of the class  --> This will store in the Heap Memory
        // new --> is the keyword
        // Employee is the class
        System.out.println(obj.name);
        System.out.println(obj.isPerm);
        System.out.println(obj.age);
        System.out.println(obj.salary);
        System.out.println(obj.gender); // Blank Space

        System.out.println("***********");
        obj.name="Raghu";
        obj.age= 29;
        obj.salary=90;
        obj.gender='M';
        obj.isPerm=true;
        System.out.println(obj.name);
        System.out.println(obj.isPerm);
        System.out.println(obj.age);
        System.out.println(obj.salary);
        System.out.println(obj.gender);

        Employee employee = new Employee();
        employee.name="Ravi";
        employee.age= 35;
        System.out.println(employee.name+" "+employee.age+" "+employee.salary+ " "+ employee.isPerm+" "+employee.gender);
        employee.salary=60.22;
        employee.age=23;
        employee.gender='M';
        System.out.println(employee.name+" "+employee.age+" "+employee.salary+ " "+ employee.isPerm+" "+employee.gender);

        new Employee();//No Reference Object --> These are anti-patterns of the Object --> This is not a good approach
        new Employee().name="Tom";
        new Employee().age=23;

        //Null pointer object variables
        Employee employee1 = new Employee();
        //employee1=null; // -> employee1 is null and it will point to earthing
      //  employee1.name="Naveen";// Null Pointer Exception
       // System.out.println(employee1.name);

      //  System.gc(); // There is no fixed gurantee that Garbage Collector will be activated

        Employee p1; //0 Objects, Employee p1 variable will not pointing to anyone

        p1 = new Employee();







    }
}
