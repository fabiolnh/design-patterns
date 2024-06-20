package creation.abstractfactory;

public class CatFactory implements IAnimalHabitatFactory {
    @Override
    public IAnimal createAnimal() {
        return new Cat();
    }

    @Override
    public IHabitat createHabitat() {
        return new CatHouse();
    }
}