package HW_FactoryMethod_Second;

public class Tesla implements CarType {

    private int price;
    private String model;
    private String range;

    public Tesla(int price, String model, String range) {
        this.price = price;
        this.model = model;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", range='" + range + '\'' +
                '}';
    }

    @Override
    public void info() {
        System.out.println("It is electric car - Tesla Model X.\n" + toString());
    }
}
