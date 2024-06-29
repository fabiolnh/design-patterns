package structure.bridge;

public class Thermostat extends AbstractSmartDevice {
    public Thermostat(IDeviceController controller) {
        super(controller);
    }

    @Override
    public void operate() {
        System.out.print("Operating Thermostat. ");
        controller.turnOn();
    }
}