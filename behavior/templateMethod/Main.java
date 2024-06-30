package behavior.templateMethod;

public class Main {
    public static void main(String[] args) {
        HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
        HouseBuilder brickHouseBuilder = new BrickHouseBuilder();

        System.out.println("Building a wooden house:");
        woodenHouseBuilder.buildHouse();

        System.out.println("\nBuilding a brick house:");
        brickHouseBuilder.buildHouse();
    }
}
