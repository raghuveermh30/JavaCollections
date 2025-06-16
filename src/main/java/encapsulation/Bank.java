package encapsulation;

public class Bank {

    private String name;
    private int age; //Age should be >=15
    private String aadharNum;
    private String phoneNum;

    public Bank(String name, int age, String aadharNum, String phoneNum) {
        this.name = name;
        if (age >= 15) {
            this.age = age;
        }
        this.aadharNum = aadharNum;
        this.phoneNum = phoneNum;
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
        if (age >= 15) {
            this.age = age;
        }
    }

    public String getAadharNum() {
        return aadharNum;
    }

    public void setAadharNum(String aadharNum) {
        if (aadharNum.length() == 12) {
            this.aadharNum = aadharNum;
        } else {
            System.out.println("Please enter valid Aadhar Number");
        }
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    //Business Logic
    public void openAccount() {
        if (this.age >= 15) {
            System.out.println("Open the Bank Account");
        } else {
            System.out.println("Age is less than 15, Minimum age is 15");
        }
    }
}
