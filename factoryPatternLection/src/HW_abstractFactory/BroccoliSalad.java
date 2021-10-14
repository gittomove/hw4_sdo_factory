package HW_abstractFactory;

public class BroccoliSalad implements SaladOrderFactory{
    @Override
    public void info() {
        System.out.println("Creamy, crunchy, sweet, and salty Vegan salad");
    }
}
