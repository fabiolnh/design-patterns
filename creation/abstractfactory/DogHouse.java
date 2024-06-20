package creation.abstractfactory;

public class DogHouse implements IHabitat {
    @Override
    public void describe() {
        System.out.println("This is a dog house.");
    }
}