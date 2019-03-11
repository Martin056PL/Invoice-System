import java.util.Scanner;

public class ProgramMenu {
    public static void showProgramMenu() {
        System.out.println("Witamy w programie do rozliczania pracowników Invoice Servis!");
        System.out.println("Możliwe działania: ");
        System.out.println("1 - Wyświetl listę pracowników");
        System.out.println("2 - Dodaj nowego pracownika");
        System.out.println("Z - zakończ program");
        ProgramMenu programMenu = new ProgramMenu();
        programMenu.choose();
    }

    public void choose() {
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();

        switch (choose) {
            case "1":
                EmployeeRepository employeeRepository = new EmployeeRepository();
                System.out.println(employeeRepository.getEmployeeList());
                break;
            case "2":
                EmployeeServis employeeServis = new EmployeeServis();
                System.out.println(employeeServis.AddNewEmployee());
                break;
            case "Z":
                break;
        }
    }
}
