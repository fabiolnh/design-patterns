package creation.factorymethod;

public class Dog implements IAnimal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}