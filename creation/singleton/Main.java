package creation.singleton;

public class Main {
    public static void main(String[] args) {
        
        Singleton singleton = Singleton.getInstance();     
        Singleton anotherSingleton = Singleton.getInstance();
        
        if (singleton == anotherSingleton) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}
