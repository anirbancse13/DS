package design.patterns.structural.proxy;

public class ClientTest {
    public static void main(String[] args) {
        Load proxy = new LoadProxyImpl();
        proxy.load();
        proxy.getData();
    }
}
