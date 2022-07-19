package design.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployeeProto implements Cloneable {
    private List<String> empList;

    public EmployeeProto() {
        empList = new ArrayList<>();
    }

    public EmployeeProto(List<String> empList) {
        this.empList = empList;
    }

    public void load(){
        empList.add("Amrita");
        empList.add("Debopriyo");
        empList.add("Soyel");
        empList.add("Arijit");
    }

    public List<String> getEmpList(){
        return empList;
    }

    @Override
    public EmployeeProto clone() throws CloneNotSupportedException{
            List<String> temp = new ArrayList<>(getEmpList());
           return new EmployeeProto(temp);
    }
}
