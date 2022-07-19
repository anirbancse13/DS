package design.patterns.singleton;

public class StaticClient {

    public static void main(String[] args) {
        StaticBlockInitialization obj1 = StaticBlockInitialization.getInstance();
        StaticBlockInitialization obj2 = StaticBlockInitialization.getInstance();

        //Both objects will have same hashcode
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}

/*
Static block initialization implementation is similar to eager initialization,
except that instance of class is created in the static block that provides option for exception handling.
 */