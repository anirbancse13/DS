package design.patterns.prototype;

public class ProtoClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        EmployeeProto p1 = new EmployeeProto();
        p1.load();
        EmployeeProto p2 = (EmployeeProto) p1.clone();

        //Load method is called only once, but it creates separate list for separate cloned objects
        //If we do a new EmployeeProto it will also create separate list for separate object but load operation will be called multiple times which might be costly

        p1.getEmpList().add("Barkha");
        p2.getEmpList().add("Jayita");
        p1.getEmpList().forEach(System.out::println);
        p2.getEmpList().forEach(System.out::println);

    }
}
