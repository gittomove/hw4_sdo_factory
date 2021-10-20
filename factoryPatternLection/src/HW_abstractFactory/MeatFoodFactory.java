package HW_abstractFactory;

public class MeatFoodFactory implements OrdersFactory{
    @Override
    public SaladOrder orderSalad() {
        return new PineappleMixSalad();
    }

    @Override
    public SoupOrder orderSoup() {
        return new NauryzSoup();
    }
}
