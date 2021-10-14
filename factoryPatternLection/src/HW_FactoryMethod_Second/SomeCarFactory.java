package HW_FactoryMethod_Second;

public class SomeCarFactory {
    protected int price;

    public static CarType createCar(String type){
        if(type.equals(CarType.TESLA)){
            return new Tesla(90000, "Model X Long Range", "600km");
        }else if(type.equals(CarType.Toyota)){
            return new Toyota(50000,"Camry 3.5", "250km/full petrol");
        }else{
            return null;
        }
    }

}
