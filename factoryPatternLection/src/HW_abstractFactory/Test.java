package HW_abstractFactory;

public class Test {
    public static void main(String[] args) {
        OrdersFactory meatLoverFactory = new MeatFoodFactory();
        SaladOrder saladOrderFactory = meatLoverFactory.orderSalad();
        SoupOrder soupOrderFactory = meatLoverFactory.orderSoup();

        System.out.println("Ordered:");
        saladOrderFactory.info();
        soupOrderFactory.info();
    }
}
