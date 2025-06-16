package javasessions;

public class Customer {

    //Write a Function (WAP)
    // Create the function named as getCustomerMarks
    // this will return the customer marks on the basis of given customer

    // getCustomerMarks(String name) --> return is Marks

    public int getCustomerMarks(String name) {
        System.out.println("customer Name is : " + name);

        int marks = -1;
        if (name.trim().equalsIgnoreCase("Piyush")) {
            // return 90;
            marks = 90;
        } else if (name.trim().equalsIgnoreCase("Ravi")) {
            // return 95;
            marks = 95;
        } else if (name.trim().equalsIgnoreCase("Naveen")) {
            // return 10;
            marks = 10;
        } else {
            System.out.println("Please pass the right customer name.." + name);
        }

        return marks;
    }


    public static void main(String[] args) {

        Customer customer = new Customer();
        int marks = customer.getCustomerMarks("Naveen");
        System.out.println(marks);

        if (marks >= 35) {
            System.out.println("Print the Marksheet");
        }
    }
}
