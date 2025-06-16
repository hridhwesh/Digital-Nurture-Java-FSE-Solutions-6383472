public class Computer {
    private final String cpu;
    private final String ram;
    private final String storage;

    private Computer(Builder builder) {
        this.cpu     = builder.cpu;
        this.ram     = builder.ram;
        this.storage = builder.storage;
    }

    @Override
    public String toString() {
        return "Computer:\n"
             + " CPU: "     + cpu     + "\n"
             + " RAM: "     + ram     + "\n"
             + " Storage: " + storage;
    }

    // Static inner Builder class
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;   

        // Setter for CPU with method chaining
        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;  
        }

        // Setter for RAM with method chaining
        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }
        
        // Setter for Storage with method chaining
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        // Builds and returns the final Computer object
        public Computer build() {
            return new Computer(this);
        }
    }
}
