import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double basicSalary;
    double grossSalary;

    Employee(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
        calculateGrossSalary();
    }

    void calculateGrossSalary() {
        grossSalary = basicSalary + (0.1 * basicSalary) + (0.05 * basicSalary); // 10% HRA, 5% DA
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        Employee emp = new Employee(empId, empName, basicSalary);
        emp.display();
    }
}
