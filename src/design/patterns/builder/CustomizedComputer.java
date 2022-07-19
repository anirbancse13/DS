package design.patterns.builder;

public class CustomizedComputer {

    public CustomizedComputer(ComputerBuilder builder) {
        this.processor = builder.processor;
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.monitor = builder.monitor;
        this.chargerType = builder.chargerType;
        this.cameraPixel = builder.cameraPixel;
        this.bluetooth = builder.bluetooth;
    }

    //required fields to construct any kind of computer
    private String processor;
    private String hdd;
    private String ram;

    //Optional fields for Desktop
    private String monitor;

    //Optional fields for laptop
    private String chargerType;

    //Optional fields for mobile
    private String cameraPixel;

    //Optional fields for all
    private String bluetooth;

    public String getProcessor() {
        return processor;
    }

    public String getHdd() {
        return hdd;
    }

    public String getRam() {
        return ram;
    }

    public String getMonitor() {
        return monitor;
    }

    public String getChargerType() {
        return chargerType;
    }

    public String getCameraPixel() {
        return cameraPixel;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    @Override
    public String toString() {
        return "CustomizedComputer{" +
                "processor='" + processor + '\'' +
                ", hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                ", monitor='" + monitor + '\'' +
                ", chargerType='" + chargerType + '\'' +
                ", cameraPixel='" + cameraPixel + '\'' +
                ", bluetooth='" + bluetooth + '\'' +
                '}';
    }

    public  static class ComputerBuilder {
        private String processor;
        private String hdd;
        private String ram;

        //Optional fields for Desktop
        private String monitor;

        //Optional fields for laptop
        private String chargerType;

        //Optional fields for mobile
        private String cameraPixel;

        //Optional fields for all
        private String bluetooth;

        public ComputerBuilder(String processor, String hdd, String ram) {
            this.processor = processor;
            this.hdd = hdd;
            this.ram = ram;
        }

        public ComputerBuilder setMonitor(String monitor) {
            this.monitor = monitor;
            return this;
        }

        public ComputerBuilder setChargerType(String chargerType) {
            this.chargerType = chargerType;
            return this;
        }

        public ComputerBuilder setCameraPixel(String cameraPixel) {
            this.cameraPixel = cameraPixel;
            return this;
        }

        public ComputerBuilder setBluetooth(String bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public CustomizedComputer build() {
            return new CustomizedComputer(this);
        }
    }
}
