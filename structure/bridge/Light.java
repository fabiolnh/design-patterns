package structure.bridge;

// RefinedAbstractions
public class Light extends AbstractSmartDevice {
    public Light(IDeviceController controller) {
        super(controller);
    }

    @Override
    public void operate() {
        System.out.print("Operating Light. ");
        controller.turnOn();
    }
}