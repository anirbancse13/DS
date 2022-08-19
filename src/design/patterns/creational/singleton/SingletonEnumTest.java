package design.patterns.creational.singleton;

public class SingletonEnumTest {
    public static void main(String[] args) {
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;

        System.out.println(singletonEnum.hashCode());
        System.out.println(singletonEnum2.hashCode());
        System.out.println(singletonEnum2.hashCode());

    }
}
