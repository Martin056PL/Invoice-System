import sun.plugin.javascript.navig.Link;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmployeeRepository {
    private LinkedList<Employee> defaultEmployeeList() {
        LinkedList<Employee> defaultArrayList = new LinkedList<>();
        Employee employee1 = new Employee("Andrzej", "Nowak", JobContract.B2B, BigDecimal.valueOf(2500));
        Employee employee2 = new Employee("Mirosław", "Bok", JobContract.UoP, BigDecimal.valueOf(3000));

        defaultArrayList.add(employee1);
        defaultArrayList.add(employee2);
        return defaultArrayList;
    }

    public LinkedList<Employee> getEmployeeList() {
        LinkedList<Employee> employeeList = defaultEmployeeList();
        return employeeList;
    }


}
