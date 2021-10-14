package HW_abstractFactory;

public class VegetarianFoodOrderFactory implements OrdersFactory{
    @Override
    public SaladOrderFactory orderSalad() {
        return new BroccoliSalad();
    }

    @Override
    public SoupOrderFactory orderSoup() {
        return new PeaSoup();
    }
}
