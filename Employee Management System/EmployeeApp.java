import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {

         String name = "";
         int age = 0;
         String designation = "";
         int choice;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n1) Create Employee");
            System.out.println("2) Display Employee");
            System.out.println("3) Raise Salary of Employee");
            System.out.println("4) Exit Application");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.print("Enter Name: ");
                name = scanner.nextLine();

                System.out.print("Enter Age: ");
                age = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Designation: ");
                designation = scanner.nextLine();

                System.out.print("Confirm? (y/n): ");
                String confirm = scanner.nextLine();

                if (confirm.equals("y")) {
                    System.out.println("Employee Created!");
                } else {
                    System.out.println("Cancelled.");
                }

            } else if (choice == 2) {

                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Designation: " + designation);

            } else if (choice == 3) {

                System.out.print("Enter raise amount: ");
                int raise = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Salary raised by " + raise);

            } else if (choice == 4) {

                System.out.println("Goodbye!");

            }

        } while (choice != 4);

    }
}
