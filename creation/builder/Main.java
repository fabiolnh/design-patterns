package creation.builder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .withEngine("V8")
                .withTransmission("Automatic")
                .withWheels(4)
                .withColor("Red")
                .withAirbags(true)
                .withSunroof(true)
                .build();

        System.out.println(car);
    }
}
