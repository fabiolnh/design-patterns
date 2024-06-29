package structure.bridge;

// ConcreteImplementors
public class MobileAppController implements IDeviceController {
    @Override
    public void turnOn() {
        System.out.println("Turning on device using Mobile App");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off device using Mobile App");
    }
}