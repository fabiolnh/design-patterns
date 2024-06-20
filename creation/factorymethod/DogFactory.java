package creation.factorymethod;

public class DogFactory extends AnimalFactory {
    @Override
    public IAnimal createAnimal() {
        return new Dog();
    }
}