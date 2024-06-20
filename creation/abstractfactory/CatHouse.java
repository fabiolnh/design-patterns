package creation.abstractfactory;

public class CatHouse implements IHabitat {
    @Override
    public void describe() {
        System.out.println("This is a cat house.");
    }
}