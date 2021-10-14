package abstractFactory;

public class IndustrialAgeGAmeUnitFactory implements GameUnitFactory{
    @Override
    public LandUnit createLandUnit() {
        return new Rifleman();
    }

    @Override
    public NavaUnit createNavaUnit() {
        return new Ironclad();
    }
}
