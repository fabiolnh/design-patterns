package structure.bridge;

public class VoiceController implements IDeviceController {
    @Override
    public void turnOn() {
        System.out.println("Turning on device using Voice Control");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off device using Voice Control");
    }
}