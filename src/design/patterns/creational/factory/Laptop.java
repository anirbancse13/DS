package design.patterns.creational.factory;

public class Laptop implements Computer {
    @Override
    public void getSpec() {
        System.out.println("Laptop Spec");
    }
}
