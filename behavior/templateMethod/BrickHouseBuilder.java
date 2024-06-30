package behavior.templateMethod;

public class BrickHouseBuilder extends HouseBuilder {

    @Override
    protected void buildFoundation() {
        System.out.println("Building brick foundation");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building brick walls");
    }

    @Override
    protected void buildRoof() {
        System.out.println("Building brick roof");
    }
}
