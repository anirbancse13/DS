package design.patterns.creational.builder;

public class CustomizedCustomerClient {
    public static void main(String[] args) {
        CustomizedComputer desktop = new CustomizedComputer.ComputerBuilder("INTEL", "1 TB", "16 GB").setBluetooth("3.0").
                setMonitor("4K").build();
        CustomizedComputer laptop = new CustomizedComputer.ComputerBuilder("AMD", "2 TB", "32 GB").setBluetooth("3.0")
                .setChargerType("FAST").build();
        CustomizedComputer mobile = new CustomizedComputer.ComputerBuilder("A13", "12 TB", "64 GB").setBluetooth("5.0")
                .setCameraPixel("30MP").build();
        System.out.println(desktop);
        System.out.println(laptop);
        System.out.println(mobile);
    }
}
