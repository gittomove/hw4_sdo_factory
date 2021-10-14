package abstractFactory;

public class Client{
    public static void main(String[] args) {
        GameUnitFactory game = new IndustrialAgeGAmeUnitFactory();

        LandUnit landUnit = game.createLandUnit();
        NavaUnit navaUnit = game.createNavaUnit();

        System.out.println("\nINDUSTRIAL\n");

        navaUnit.info();
        landUnit.info();

        System.out.println("\nMEDIEVAL\n");

        game = new MedievalGameUnitFactory();

        NavaUnit navaUnit1 = game.createNavaUnit();
        LandUnit landUnit1 = game.createLandUnit();

        navaUnit1.info();
        landUnit1.info();


    }
}
