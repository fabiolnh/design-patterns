package creation.abstractfactory;

// Abstract Factory
public interface IAnimalHabitatFactory {
    IAnimal createAnimal();
    IHabitat createHabitat();
}