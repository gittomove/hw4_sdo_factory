package HW_FactoryMethod;

public class ElectricCarFactory extends SomeCarFactory{
    @Override
    CarType createCar() {
        return new TeslaModelX();
    }
}
