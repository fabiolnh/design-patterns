package structure.bridge;

// Abstraction
public abstract class AbstractSmartDevice {
    protected IDeviceController controller;

    public AbstractSmartDevice(IDeviceController controller) {
        this.controller = controller;
    }

    public abstract void operate();
}