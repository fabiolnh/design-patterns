package creation.factorymethod;

public class CatFactory extends AnimalFactory {
    @Override
    public IAnimal createAnimal() {
        return new Cat();
    }
}