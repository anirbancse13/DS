package design.patterns.structural.proxy;

public class LoadProxyImpl implements Load {
    Load load;

    @Override
    public void load() {

    }

    public void getData() {
        load = new LoadImpl();
        load.load();
    }
}
