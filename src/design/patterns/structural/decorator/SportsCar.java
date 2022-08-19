package design.patterns.structural.decorator;

public class SportsCar extends CarDecorator{
    SportsCar(Car c) {
        super(c);
    }

    @Override
    public void design() {
        super.design();
        System.out.println("Sports Car feature");
    }
}
