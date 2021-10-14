package HW_abstractFactory;

public class MeatFoodOrderFactory implements OrdersFactory{
    @Override
    public SaladOrderFactory orderSalad() {
        return new PineappleMix();
    }

    @Override
    public SoupOrderFactory orderSoup() {
        return new NauryzKozheSoup();
    }
}
