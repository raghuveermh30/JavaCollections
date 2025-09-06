package encapsulation;


import java.util.Arrays;

public class TestEmployee {

    public static void main(String[] args) {

        //String name, int age, double salary, boolean isPerm, double empId

        //Create API -->POST
        Employee employee = new Employee("pooja", 25, 12.33, true, 12345);

        //Retrive GET
        System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getSalary() + " " + employee.isPerm() + " " + employee.getEmpId());

        //Update - PUT
        employee.setAge(30);
        employee.setSalary(30.33);

        //Retrive GET
        System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getSalary() + " " + employee.isPerm() + " " + employee.getEmpId());

        Employee employee1 = new Employee("pooja", 25, 12.33, false, 12345);
        System.out.println(employee1.getName() + " " + employee1.getAge() + " " + employee1.getSalary() + " " + employee1.isPerm() + " " + employee1.getEmpId());

        employee1.setPerm(true);
        employee1.setSalary(35.66);
        System.out.println(employee1.getName() + " " + employee1.getAge() + " " + employee1.getSalary() + " " + employee1.isPerm() + " " + employee1.getEmpId());

        Browser browser = new Browser();
        browser.launchBrowser();

        System.out.println("**********");

        //Create the User Cred -> Post Call
        LoginPage loginPage = new LoginPage("Raghuveer", "Raghu@123");
        loginPage.doLogin(loginPage.getUserName(), loginPage.getPassword());
        System.out.println("**********");
        loginPage.doLogin();
        System.out.println(loginPage.getUserName() + " " + loginPage.getPassword());

        //Update the password
        System.out.println("**********");
        loginPage.setPassword("Raghu@9090");
        System.out.println(loginPage.getUserName() + " " + loginPage.getPassword());


        LoginPage loginPage1 = new LoginPage("Naveen", "N@veen@123");
        loginPage1.doLogin();
        loginPage1.doLogin(loginPage1.getUserName(), loginPage1.getPassword());

        //Update the password
        System.out.println("**********");
        loginPage1.setPassword("N@veen@9090");
        System.out.println(loginPage1.getUserName() + " " + loginPage1.getPassword());

        //Private Constructor
        Company.getRevnue();



    }
}
