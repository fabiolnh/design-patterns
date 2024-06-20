package creation.factorymethod;

public class DogFactory implements IAnimalFactory {
    @Override
    public IAnimal createAnimal() {
        return new Dog();
    }
}