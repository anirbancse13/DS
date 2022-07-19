package design.patterns.singleton;

public class EagerInitialization {

    //private constructor to disable client from calling the constructor to create object using new operator
    private EagerInitialization (){

    }
    //create final instance
    private final static EagerInitialization obj = new EagerInitialization();

    //Provide the instance to client via public static getter method
    public static EagerInitialization getInstance(){
        return obj;
    }

}
