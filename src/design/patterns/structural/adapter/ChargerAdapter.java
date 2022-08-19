package design.patterns.structural.adapter;

public class ChargerAdapter extends TypeC implements Charger {
    // TypeC typeC = new TypeC(); // Remove extends when using composition
    @Override
    public void lightningCharge() {
       fastCharge();
//       typeC.fastCharge();
    }
}
