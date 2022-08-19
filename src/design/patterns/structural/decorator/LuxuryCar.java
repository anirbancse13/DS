package design.patterns.structural.decorator;

public class LuxuryCar extends CarDecorator{
    LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void design() {
        super.design();
        System.out.println("Luxury Car feature");
    }
}
