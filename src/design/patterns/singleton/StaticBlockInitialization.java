package design.patterns.singleton;

public class StaticBlockInitialization {

    private StaticBlockInitialization(){

    }

    private static StaticBlockInitialization instance;

    //static block initialization for exception handling. All other characteristic is similar to eager initialization
    static {
        try{
            instance = new StaticBlockInitialization();
        }catch (Exception e){
            System.out.println("Error creating instance");
        }
    }

    public static StaticBlockInitialization getInstance(){
        return instance;
    }
}
