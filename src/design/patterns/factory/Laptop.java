package design.patterns.factory;

import design.patterns.factory.Computer;

public class Laptop implements Computer {
    @Override
    public void getSpec() {
        System.out.println("Laptop Spec");
    }
}
