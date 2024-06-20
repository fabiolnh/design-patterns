package creation.abstractfactory;

public class Main {
    public static void main(String[] args) {
        IAnimalHabitatFactory dogFactory = new DogFactory();
        IAnimal dog = dogFactory.createAnimal();
        IHabitat dogHouse = dogFactory.createHabitat();
        dog.makeSound(); 
        dogHouse.describe();

        IAnimalHabitatFactory catFactory = new CatFactory();
        IAnimal cat = catFactory.createAnimal();
        IHabitat catHouse = catFactory.createHabitat();
        cat.makeSound(); 
        catHouse.describe();
    }
}