package HW_FactoryMethod_Second;

public class SomeCarFactory {

    public static CarType createCar(String type){
        if(type.equals("Tesla")){
            return new Tesla(90000, "Model X Long Range", "600km");
        }else if(type.equals("Toyota")){
            return new Toyota(50000,"Camry 3.5", "250km/full petrol");
        }else{
            return null;
        }
    }

}
