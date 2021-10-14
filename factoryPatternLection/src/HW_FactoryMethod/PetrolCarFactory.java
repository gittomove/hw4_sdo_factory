package HW_FactoryMethod;

public class PetrolCarFactory extends SomeCarFactory {

    @Override
    CarType createCar() {
        return new ToyotaCamry();
    }
}
