package model;

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

    public Enum getJobContract(JobContract b2b) {
        return jobContract;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setJobContract(Enum jobContract) {
        this.jobContract = jobContract;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Imię pracownika: " + firstName + "; nazwisko pracownika: " +
        lastName + "; rodzaj umowy: " + jobContract + "; pensja: " + salary + "zł\n";
}
}
