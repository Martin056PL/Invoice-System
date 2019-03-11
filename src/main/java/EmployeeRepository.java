import java.math.BigDecimal;
import java.util.ArrayList;

public class EmployeeRepository {
    private ArrayList<Employee> defaultEmployeeList() {
        ArrayList<Employee> defaultArrayList = new ArrayList<>();
        Employee employee1 = new Employee("Andrzej", "Nowak", JobContract.B2B, BigDecimal.valueOf(2500));
        Employee employee2 = new Employee("Mirosław", "Bok", JobContract.UoP, BigDecimal.valueOf(3000));

        defaultArrayList.add(employee1);
        defaultArrayList.add(employee2);
        return defaultArrayList;
    }

    public ArrayList<Employee> getEmployeeList() {
        ArrayList<Employee> employeeList = defaultEmployeeList();
        return employeeList;
    }


}
