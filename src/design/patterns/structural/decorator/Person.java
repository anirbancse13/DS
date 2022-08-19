package design.patterns.structural.decorator;

public class Person {
    public static void main(String[] args) {
        Car car = new SportsCar(new LuxuryCar(new BasicCar()));
        car.design();


        Car bc = new BasicCar();


    }
}
