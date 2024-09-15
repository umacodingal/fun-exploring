import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Employee class to represent an employee
class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: $" + salary;
    }
}

public class EmployeeManagement {

private static List<Employee> employees = new ArrayList<>();

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
        }
    }
}
