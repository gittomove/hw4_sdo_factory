package abstractFactory;

public class MedievalGameUnitFactory implements GameUnitFactory{
    @Override
    public LandUnit createLandUnit() {
        return new Swordsman();
    }

    @Override
    public NavaUnit createNavaUnit() {
        return new Galley();
    }
}
