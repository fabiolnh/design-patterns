package creation.factorymethod;

public class Cat implements IAnimal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}