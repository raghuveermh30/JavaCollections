package superpackage;

public class BMW extends Car{

    int speed = 300;

    @Override
    public void start(){
        super.start(); //Car class method will be called
        System.out.println("BMW start");
        super.refuel();
    }

    public void autoParking(){
        System.out.println("BMW autoParking");
        super.start();
    }

    public void displaySpeed(){
        System.out.println("BMW speed is : "+speed);
        System.out.println("Parent Car speed is : "+super.speed);
      //  System.out.println("Vehicle car speed is "+super.speed);
    }
}
