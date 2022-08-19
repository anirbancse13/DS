package design.patterns.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    //Introduce holder class to implement double-check locking. Thread safe mechanism
    private static final class InstanceHolder {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstanceUsingDoubleLocking(){
        return InstanceHolder.instance;
    }

    //To avoid breaking of singleton when the Singleton Object is serialized
    protected Object readResolve() {
        return getInstanceUsingDoubleLocking();
    }
}
