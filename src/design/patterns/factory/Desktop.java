package design.patterns.factory;

public class Desktop implements Computer{
    @Override
    public void getSpec() {
        System.out.println("Desktop Spec");
    }
}
