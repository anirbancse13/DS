package design.patterns.structural.adapter;

public class IPhone {

    public static void main(String[] args) {
       Charger c = new ChargerAdapter();
       c.lightningCharge();
    }
}
