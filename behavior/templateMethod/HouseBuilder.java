package behavior.templateMethod;

public abstract class HouseBuilder {

    // Template method
    public final void buildHouse() {
        buildFoundation();
        buildWalls();
        buildRoof();
        decorateHouse();
        furnishHouse();
    }

    // Métodos abstratos a serem implementados pelas subclasses
    protected abstract void buildFoundation();
    protected abstract void buildWalls();
    protected abstract void buildRoof();

    // Métodos concretos
    protected void decorateHouse() {
        System.out.println("Decorating the house");
    }

    protected void furnishHouse() {
        System.out.println("Furnishing the house");
    }
}
