package HW_abstractFactory;

public class RawFoodFactory implements OrdersFactory{
    @Override
    public SaladOrder orderSalad() {
        return new WaldorfSalad();
    }

    @Override
    public SoupOrder orderSoup() {
        return new TomatoSoup();
    }
}
