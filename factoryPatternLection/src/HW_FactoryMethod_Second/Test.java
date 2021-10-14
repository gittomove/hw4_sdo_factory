package HW_FactoryMethod_Second;

public class Test {
    public static void main(String[] args) {
        CarType car = SomeCarFactory.createCar(CarType.Toyota);
        car.info();
    }
}
