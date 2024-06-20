package creation.factorymethod;

public class Main {
    public static void main(String[] args) {
        IAnimalFactory dogFactory = new DogFactory();
        IAnimal dog = dogFactory.createAnimal();
        dog.makeSound();

        IAnimalFactory catFactory = new CatFactory();
        IAnimal cat = catFactory.createAnimal();
        cat.makeSound();
    }
}