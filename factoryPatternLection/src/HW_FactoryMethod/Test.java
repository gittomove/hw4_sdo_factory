package HW_FactoryMethod;

public class Test {
    public static void main(String[] args) {
        SomeCarFactory factory = new ElectricCarFactory();
        CarType car = factory.createCar();

        car.info();
    }
}
