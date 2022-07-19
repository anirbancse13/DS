//Convert list of employees to map where key will be city and value will be list of employees

package java8.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    private int id;
    private String name;
    private String city;

    Employee(int id, String name, String city){
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (getId() != employee.getId()) return false;
        if (getName() != null ? !getName().equals(employee.getName()) : employee.getName() != null) return false;
        return getCity() != null ? getCity().equals(employee.getCity()) : employee.getCity() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
public class ListToMap {
    private static List<Employee> createEmpList() {
        Employee e1 = new Employee(1, "Suresh", "Kolkata");
        Employee e2 = new Employee(2, "Ramesh", "Bangalore");
        Employee e3 = new Employee(3, "Mahesh", "Bangalore");
        Employee e4 = new Employee(4, "Dinesh", "Kolkata");
        Employee e5 = new Employee(1, "Kamlesh", "Delhi");

        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        return empList;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = createEmpList();


        Map<String, List<Employee>> empMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getCity));

        //Print the map
        empMap.forEach((k,v) -> System.out.println("City: " + k + " Employees: " +v));

    }
}
