package HW_FactoryMethod;

public class TeslaModelX implements CarType{
    @Override
    public void info() {
        System.out.println("It is electric car - Tesla Model X.");
    }
}
