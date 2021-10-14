package HW_abstractFactory;

public interface OrdersFactory{
    SaladOrderFactory orderSalad();
    SoupOrderFactory orderSoup();
}
