package superpackage;

public class TestCar {

    public static void main(String[] args) {

        BMW bmw = new BMW();
        bmw.start();
        bmw.autoParking();
        bmw.displaySpeed();

        System.out.println("*********");


        Audi audi1 = new Audi(10,20);

        System.out.println("*********");

        Honda honda = new Honda();



    }


}
