package service;

import dao.EmployeeRepository;

import java.util.Scanner;

public class ProgramMenu {
    public static void showProgramMenu() {
        System.out.println("Witamy w programie do rozliczania pracowników Invoice Servis!\nMożliwe działania: \n" +
                "1 - Wyświetl listę pracowników\n2 - Dodaj nowego pracownika\nz - zakończ program");
        ProgramMenu programMenu = new ProgramMenu();
        programMenu.choose();
    }

    public void choose() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz opcje ktorą chcesz wykonać: ");
        String choose = scanner.nextLine();

        switch (choose) {
            case "1":
                EmployeeRepository employeeRepository = new EmployeeRepository();
                System.out.println(employeeRepository.getEmployeeList());
                break;
            case "2":
                EmployeeServis employeeServis = new EmployeeServis();
                System.out.println(employeeServis.createNewEmployee());
                break;
            case "z":
                System.out.println("Dziękujemy za skorzystanie z progeramu!");
                break;
            default:
                System.out.println("coś poszło nie tak!");
        }
    }
}
