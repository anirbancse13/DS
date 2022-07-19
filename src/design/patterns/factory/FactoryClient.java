package design.patterns.factory;

public class FactoryClient {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        Computer desktop = computerFactory.getComputer("Desktop");
        Computer laptop = computerFactory.getComputer("Laptop");

        desktop.getSpec();
        laptop.getSpec();
    }
}
