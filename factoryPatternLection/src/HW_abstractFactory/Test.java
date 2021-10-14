package HW_abstractFactory;

public class Test {
    public static void main(String[] args) {
        OrdersFactory meatLoverFactory = new MeatFoodOrderFactory();
        SaladOrderFactory saladOrderFactory = meatLoverFactory.orderSalad();
        SoupOrderFactory soupOrderFactory = meatLoverFactory.orderSoup();

        System.out.println("Ordered:");
        saladOrderFactory.info();
        soupOrderFactory.info();
    }
}
