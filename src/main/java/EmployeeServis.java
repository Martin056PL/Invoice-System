import java.math.BigDecimal;
import java.util.Scanner;

public class EmployeeServis {

    public Employee AddNewEmployee() {
        System.out.println("Dodawanie nowego pracownika");
        System.out.println("Podaj imię pracownika: ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko pracownika: ");
        String lastName = scanner.nextLine();
        System.out.println("Podaj formę zatrudnienia (1 - B2B, 2 - UoP): ");
        int choseContractForm = scanner.nextInt();

        Employee employee = new Employee();

        if (choseContractForm == 1) {
            employee = new Employee(firstName, lastName, JobContract.B2B, salaryForB2BContract());
        } else if (choseContractForm == 2) {
            System.out.println("Podaj pensję netto pracownika (zł): ");
            Integer salaryInInteger = scanner.nextInt();
            BigDecimal salary = BigDecimal.valueOf(salaryInInteger);
            employee = new Employee(firstName, lastName, JobContract.UoP, salary);
        }
        return employee;
    }

    private BigDecimal salaryForB2BContract() {
        System.out.println("Wynagrodzenie pracownika za formę B2B");
        System.out.println("Podaj ile dni pracował pracownik: ");
        Scanner scanner = new Scanner(System.in);
        Integer daysOfWorkInInteger = scanner.nextInt();
        BigDecimal daysOfWorkInBigDecimal = BigDecimal.valueOf(daysOfWorkInInteger);
        System.out.println("Podaj stawkę dzienną dla pracownika zatrudnionego na zasadach B2B: ");
        Integer daySalaryForB2BEmpolyeeAsInteger = scanner.nextInt();
        BigDecimal daySalaryForB2BEmpolyeeAsBigDecimal = BigDecimal.valueOf(daySalaryForB2BEmpolyeeAsInteger);
        BigDecimal finalSalary= daySalaryForB2BEmpolyeeAsBigDecimal.multiply(daysOfWorkInBigDecimal);
        System.out.println("Wynagrodzenie pracownika zatrudnionego w formie B2b wynosi: " + finalSalary);
        return finalSalary;

    }
}
