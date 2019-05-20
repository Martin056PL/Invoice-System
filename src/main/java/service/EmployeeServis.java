package service;

import model.Employee;
import model.JobContract;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeServis {

    private static final int INVALID_DAYS_OF_WORK = -1;
    private static final String DAYS = "Days";
    private static final String SALARY = "SALARY";


    public Employee createNewEmployee() {
        System.out.println("Dodawanie nowego pracownika \nPodaj imię pracownika: ");
        Scanner scanner = new Scanner(System.in);

        String firstName = returnWords(scanner);
        System.out.println("Podaj nazwisko pracownika: ");
        String lastName = returnWords(scanner);
        System.out.println("Podaj formę zatrudnienia (1 - B2B, 2 - UoP): ");
        int choseContractForm = scanner.nextInt();

        Employee employee = new Employee();

        if (choseContractForm == 1) {
            employee.setFirstName(firstName);
            employee.setLastName(lastName);
            employee.setJobContract(JobContract.B2B);
            employee.setSalary(salaryForB2BContract());
        } else if (choseContractForm == 2) {
            employee.setFirstName(firstName);
            employee.setLastName(lastName);
            employee.setJobContract(JobContract.UoP);
            employee.setSalary(getSalaryForUoP(scanner));
        }else{

        }
        return employee;
    }

    public LinkedList<Employee> employeesList(LinkedList<Employee> defaultListOfEmployees){
    defaultListOfEmployees.add(createNewEmployee());
    return defaultListOfEmployees;
    }

    private BigDecimal salaryForB2BContract() {
        System.out.println("Wynagrodzenie pracownika za formę B2B \nPodaj ile dni pracował pracownik: ");
        Scanner scanner = new Scanner(System.in);

        BigDecimal daysOfWorkInBigDecimal = getProperNumber(scanner, DAYS);
        System.out.println("Podaj stawkę dzienną dla pracownika zatrudnionego na zasadach B2B: ");
        BigDecimal daySalaryForB2BEmpolyeeAsBigDecimal = getProperNumber(scanner, SALARY);
        BigDecimal finalSalary = daySalaryForB2BEmpolyeeAsBigDecimal.multiply(daysOfWorkInBigDecimal);
        System.out.println("Wynagrodzenie pracownika zatrudnionego w formie B2B wynosi: " + finalSalary);
        return finalSalary;

    }

    private BigDecimal getProperNumber(Scanner scanner, String mark) {
        BigDecimal value = BigDecimal.valueOf(INVALID_DAYS_OF_WORK);
        boolean ds = true;
        while (ds)
            try {
                if(mark.equals(DAYS)) {
                    value = returnInputInteger(scanner);
                }else if(mark.equals(SALARY)){
                    value = returnInputDouble(scanner);
                }
                ds = false;
            } catch (InputMismatchException e) {
                System.out.println("Niepoprawy format danych! " + e);
                scanner.next();
            }
        return value.setScale(1,RoundingMode.CEILING);
    }

    private static String returnWords(Scanner scanner) throws InputMismatchException {
        return scanner.nextLine();
    }

    private static BigDecimal returnInputInteger(Scanner scanner) throws InputMismatchException{
        return BigDecimal.valueOf(scanner.nextInt());
    }

    private static BigDecimal returnInputDouble(Scanner scanner) throws InputMismatchException{
        return BigDecimal.valueOf(scanner.nextDouble());
    }

    private BigDecimal getSalaryForUoP(Scanner scanner) {
        System.out.println("Podaj pensję netto pracownika (zł): ");
        return returnInputDouble(scanner);
    }
}
