package HW_FactoryMethod_Second;

public class Test {
    public static void main(String[] args) {
        CarType car = SomeCarFactory.createCar("Toyota");
        car.info();

        System.out.println("\n");

        car = SomeCarFactory.createCar("Tesla");
        car.info();
    }
}
