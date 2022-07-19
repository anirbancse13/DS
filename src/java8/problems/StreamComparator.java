//Sort by name
//Sort by name desc
//Sort by city and name

package java8.problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import static java.lang.Math.E;


public class StreamComparator {
    private static List<Employee> createEmpList() {
        Employee e1 = new Employee(1, "Suresh", "Kolkata");
        Employee e7 = new Employee(20, "Ramesh Rungta", "Bangalore12");
        Employee e2 = new Employee(2, "Ramesh Rungta", "Bangalore13");
        Employee e3 = new Employee(3, "Mahesh", "Bangalore1");
        Employee e4 = new Employee(4, "Dinesh", "Kolkata");
        Employee e5 = new Employee(5, "Kamlesh", "DelhiNCR");
        Employee e6 = new Employee(6, "Kamlesh", "Delhi");

        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);
        empList.add(e7);
        return empList;
    }

    public static void main(String[] args) {
        Consumer<Employee> printEmployees = employee -> System.out.println("Name: " + employee.getName() + " City: " + employee.getCity());

        List<Employee> empList = createEmpList();
        //Before sorting (original list)
        System.out.println(" Original list ");
        empList.forEach(printEmployees);

        //Sort by name
        System.out.println("Sorted by name ");
        empList.sort(Comparator.comparing(Employee::getName));
        empList.forEach(printEmployees);

        //Sort by name desc
        System.out.println("Sorted by name desc ");
        empList.sort(Comparator.comparing(Employee::getName).reversed());
        empList.forEach(printEmployees);

        //Sort by city and name
        System.out.println("Sorted by city and name ");
        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getCity).thenComparing(Employee::getName);
        empList.sort(employeeComparator);
        empList.forEach(printEmployees);
    }


}
