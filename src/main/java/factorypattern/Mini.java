package factorypattern;

public class Mini implements Car{

    @Override
    public void assemble() {
        System.out.println("Mini Assembling");
    }
}
