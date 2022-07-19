package design.patterns.singleton;

public class EagerClient {
    public static void main(String[] args) {
        //Fetching the object via get method. All reference variable will always get the same object
        EagerInitialization obj1 = EagerInitialization.getInstance();
        EagerInitialization obj2 = EagerInitialization.getInstance();

        //Both obj1 and obj2 will have the same hashcode
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }
}

/* Drawback of eagerly initializing the object
If your singleton class is not using a lot of resources, this is the approach to use.
But in most of the scenarios, Singleton classes are created for resources such as File System, Database connections, etc.
We should avoid the instantiation until unless client calls the getInstance method.
Also, this method doesn’t provide any options for exception handling. */
