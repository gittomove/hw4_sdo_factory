package abstractFactory;

public interface GameUnitFactory {
    LandUnit createLandUnit();
    NavaUnit createNavaUnit();
}
