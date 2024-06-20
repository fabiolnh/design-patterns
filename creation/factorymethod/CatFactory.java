package creation.factorymethod;

public class CatFactory implements IAnimalFactory {
    @Override
    public IAnimal createAnimal() {
        return new Cat();
    }
}