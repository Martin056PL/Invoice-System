package dao;

import model.Employee;
import model.JobContract;

import java.math.BigDecimal;
import java.util.LinkedList;

public class EmployeeRepository {
    private LinkedList<Employee> defaultEmployeeList() {
        LinkedList<Employee> defaultLinkedList = new LinkedList<>();
        Employee employee1 = new Employee("Andrzej", "Nowak", JobContract.B2B, BigDecimal.valueOf(2500));
        Employee employee2 = new Employee("Mirosław", "Bok", JobContract.UoP, BigDecimal.valueOf(3000));

        defaultLinkedList.add(employee1);
        defaultLinkedList.add(employee2);
        return defaultLinkedList;
    }

    public LinkedList<Employee> getEmployeeList() {
        LinkedList<Employee> employeeList = defaultEmployeeList();
        return employeeList;
    }


}
