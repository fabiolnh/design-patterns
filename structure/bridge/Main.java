package structure.bridge;

public class Main {
    public static void main(String[] args) {
        AbstractSmartDevice lightWithAppControl = new Light(new MobileAppController());
        AbstractSmartDevice thermostatWithVoiceControl = new Thermostat(new VoiceController());

        lightWithAppControl.operate(); // Operating Light. Turning on device using Mobile App
        thermostatWithVoiceControl.operate(); // Operating Thermostat. Turning on device using Voice Control
    }
}