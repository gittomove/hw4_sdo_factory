package HW_FactoryMethod;

public class ToyotaCamry implements CarType{

    @Override
    public void info() {
        System.out.println("It is Petrol car - Toyota Camry.");
    }
}
