import java.math.BigDecimal;

public class Employee {

private String firstName;
private String lastName;
private Enum jobContract;
private BigDecimal salary;

    public Employee(String firstName, String lastName, Enum jobContract, BigDecimal salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobContract = jobContract;
        this.salary = salary;
    }
    public Employee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Enum getJobContract() {
        return jobContract;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Imię pracownika: " + firstName + "; nazwisko pracownika: " +
        lastName + "; rodzaj umowy: " + jobContract + "; pensja: " + salary + "zł";
}
}
