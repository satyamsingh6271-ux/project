
import java.util.ArrayList;
import java.util.Scanner;

class Employee {

    int id;
    String name;
    String department;
    String designation;
    double salary;

    Employee(int id, String name, String department,
             String designation, double salary) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    void display() {
        System.out.println("------------------------------------------");
        System.out.println("Employee ID     : " + id);
        System.out.println("Name            : " + name);
        System.out.println("Department      : " + department);
        System.out.println("Designation     : " + designation);
        System.out.println("Salary          : " + salary);
    }
}

public class EmployeeManagementSystem {

    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Add Employee
    static void addEmployee() {

        System.out.println("\n===== Add Employee =====");

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        // Check duplicate ID
        for (Employee e : employees) {
            if (e.id == id) {
                System.out.println("Employee ID already exists!");
                return;
            }
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee employee =
                new Employee(id, name, department, designation, salary);

        employees.add(employee);

        System.out.println("Employee added successfully!");
    }

    static void viewEmployees() {

        System.out.println("\n===== Employee List =====");

        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        for (Employee e : employees) {
            e.display();
        }
    }

    // Search Employee
    static void searchEmployee() {

        System.out.println("\n===== Search Employee =====");

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (Employee e : employees) {

            if (e.id == id) {
                e.display();
                return;
            }
        }

        System.out.println("Employee not found.");

    static void updateEmployee() {

        System.out.println("\n===== Update Employee =====");

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : employees) {

            if (e.id == id) {

                System.out.print("Enter New Name: ");
                e.name = sc.nextLine();

                System.out.print("Enter New Department: ");
                e.department = sc.nextLine();

                System.out.print("Enter New Designation: ");
                e.designation = sc.nextLine();

                System.out.print("Enter New Salary: ");
                e.salary = sc.nextDouble();

                System.out.println("Employee updated successfully!");
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    static void deleteEmployee() {

        System.out.println("\n===== Delete Employee =====");

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (Employee e : employees) {

            if (e.id == id) {

                employees.remove(e);

                System.out.println("Employee deleted successfully!");
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n=================================");
            System.out.println("   EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.println("=================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    viewEmployees();
                    break;

                case 3:
                    searchEmployee();
                    break;

                case 4:
                    updateEmployee();
                    break;

                case 5:
                    deleteEmployee();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

