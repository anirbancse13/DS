package design.patterns.structural.decorator;

public class PassengerCar extends CarDecorator{
    PassengerCar(Car c) {
        super(c);
    }

    @Override
    public void design() {
        super.design();
        System.out.println("Passenger Car feature");
    }
}
