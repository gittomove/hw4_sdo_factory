package HW_FactoryMethod_Second;

public class Toyota implements CarType {

    private int price;
    private String model;
    private String range;

    public Toyota(int price, String model, String range) {
        this.price = price;
        this.model = model;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", range='" + range + '\'' +
                '}';
    }

    @Override
    public void info() {

        System.out.println("It is Petrol car - Toyota Camry.\n" + toString());
    }
}
