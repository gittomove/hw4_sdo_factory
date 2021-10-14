package HW_abstractFactory;

public class RawFoodOrderFactory implements OrdersFactory{
    @Override
    public SaladOrderFactory orderSalad() {
        return new WaldorfSalad();
    }

    @Override
    public SoupOrderFactory orderSoup() {
        return new TomatoSoup();
    }
}
