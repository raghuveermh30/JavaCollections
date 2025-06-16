package encapsulation;

public class TestBank {

    public static void main(String[] args) {

        Bank b = new Bank("Veena", 50, "1234567899", "1234567890");

        System.out.println(b.getName() + " " + b.getAge() + " " + b.getAadharNum() + " " + b.getPhoneNum());
        b.openAccount();
    }
}
