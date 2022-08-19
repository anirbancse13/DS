package design.patterns.structural.proxy;

public class LoadImpl implements Load{
    @Override
    public void load() {
        System.out.println("Load full data");
    }
    public void getData() {
        load();
    }
}
