package HW_abstractFactory;

public class VegetarianFoodFactory implements OrdersFactory{
    @Override
    public SaladOrder orderSalad() {
        return new BroccoliSalad();
    }

    @Override
    public SoupOrder orderSoup() {
        return new PeaSoup();
    }
}
