package design.patterns.factory;

public class ComputerFactory {
    public Computer getComputer(String computerType){
        if("Desktop".equals(computerType)){
            return new Desktop();
        } else if ("Laptop".equals(computerType)) {
            return new Laptop();
        }else{
            return null;
        }
    }
}
