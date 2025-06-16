package accessmodifier;

public class BMW extends Car {

    @Override
    public void carBilling() {
        System.out.println("bmw--billing");
    }

    @Override
    protected void refuel(){
        System.out.println("BMW--refuel");
    }


    public static void main(String[] args) {

        BMW bmw = new BMW();
        bmw.carBilling();


    }
}
