package behavior.templateMethod;

public class WoodenHouseBuilder extends HouseBuilder {

    @Override
    protected void buildFoundation() {
        System.out.println("Building wooden foundation");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building wooden walls");
    }

    @Override
    protected void buildRoof() {
        System.out.println("Building wooden roof");
    }
}
