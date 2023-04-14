import java.util.Scanner;

// TestEmployee.java
public class TestEmployee {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select Employee Type:");
            System.out.println("1. Normal Employee");
            System.out.println("2. Bonus Employee");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Calculate normal employee salary
                    System.out.println("Normal Employee");

                    System.out.print("Enter name of the Employee:");
                    String name = scanner.nextLine();
                    System.out.print("Enter address of the Employee: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Gross Wage for Employee: ₹");
                    int normalGrossWage = scanner.nextInt();
                    System.out.print("Enter Total Working Days for Employee: ");
                    int normalTotalWorkingDays = scanner.nextInt();
                    System.out.print("Enter Paid Days for Employee: ");
                    int normalPaidDays = scanner.nextInt();
                    scanner.nextLine();

                    // create NormalEmployee object
                    NormalEmployee normalEmployee = new NormalEmployee(name, address, normalGrossWage, normalTotalWorkingDays, normalPaidDays);


                    System.out.println("Name: " + normalEmployee.getName());
                    System.out.println("Address: " + normalEmployee.getAddress());
                    System.out.println("Gross Wage: " + normalEmployee.getGrossWage());
                    System.out.println("Total Working Days: " + normalEmployee.getTotalWorkingDays());
                    System.out.println("Paid Days (Days Worked): " + normalEmployee.getPaidWorkingDays());
                    System.out.println("Salary Slip for Normal Employee");
                    double normalMonthlySalary = normalEmployee.calculateMonthlySalary();
                    System.out.println();

                    break;
                case 2:
                    // Calculate bonus employee salary
                    System.out.println("Bonus Employee");
                    // Get input from user for Employee
                    System.out.print("Enter name of the Employee:");
                    name = scanner.nextLine();
                    System.out.print("Enter address of the Employee:");
                    address = scanner.nextLine();
                    System.out.print("Enter Gross Wage for Employee: ₹");
                    normalGrossWage = scanner.nextInt();
                    System.out.print("Enter Total Working Days for Employee: ");
                    normalTotalWorkingDays = scanner.nextInt();
                    System.out.print("Enter Paid Days for Employee: ");
                    normalPaidDays = scanner.nextInt();
                    System.out.print("Enter Bonus % for Employee: ");
                    int bonusMonthlyBonus = scanner.nextInt();

                    // create NormalEmployee object
                    BonusEmployee bonusEmployee = new BonusEmployee(name, address, normalGrossWage, normalTotalWorkingDays, normalPaidDays ,bonusMonthlyBonus);


                    System.out.println("Name: " + bonusEmployee.getName());
                    System.out.println("Address: " + bonusEmployee.getAddress());
                    System.out.println("Gross Wage: ₹" + bonusEmployee.getGrossWage());
                    System.out.println("Total Working Days: " + bonusEmployee.getTotalWorkingDays());
                    System.out.println("Paid Days (Days Worked): " + bonusEmployee.getPaidWorkingDays());
                    System.out.println("Salary Slip for Normal Employee");
                    double bonusMonthlySalary = bonusEmployee.calculateMonthlySalary();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}
