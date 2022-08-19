package design.patterns.structural.decorator;

public class CarDecorator extends BasicCar{

    Car c;

    CarDecorator(Car c){
        this.c = c;
    }

    @Override
    public void design() {
        c.design();
    }
}
