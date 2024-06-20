package creation.abstractfactory;

public class DogFactory implements IAnimalHabitatFactory {
    @Override
    public IAnimal createAnimal() {
        return new Dog();
    }

    @Override
    public IHabitat createHabitat() {
        return new DogHouse();
    }
}