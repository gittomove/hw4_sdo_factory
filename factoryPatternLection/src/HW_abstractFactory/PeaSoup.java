package HW_abstractFactory;

public class PeaSoup implements SoupOrderFactory{
    @Override
    public void info() {
        System.out.println("Vegetarian soup made typically from dried peas.");
    }
}
