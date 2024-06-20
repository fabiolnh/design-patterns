package creation.builder;

public class Car {
    private String engine;
    private String transmission;
    private int wheels;
    private String color;
    private boolean airbags;
    private boolean sunroof;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.wheels = builder.wheels;
        this.color = builder.color;
        this.airbags = builder.airbags;
        this.sunroof = builder.sunroof;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", transmission=" + transmission + ", wheels=" + wheels + 
               ", color=" + color + ", airbags=" + airbags + ", sunroof=" + sunroof + "]";
    }

    public static class CarBuilder {
        private String engine;
        private String transmission;
        private int wheels;
        private String color;
        private boolean airbags;
        private boolean sunroof;

        public CarBuilder withEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder withTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public CarBuilder withWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder withColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder withAirbags(boolean airbags) {
            this.airbags = airbags;
            return this;
        }

        public CarBuilder withSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
