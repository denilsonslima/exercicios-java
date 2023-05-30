import entities.Employee;

import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = sc.next();
        System.out.print("Gross salary: ");
        employee.glossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());

        System.out.println();
        System.out.print("Which percentage to increase salary: ");
        employee.increaseSalary(sc.nextDouble());

        System.out.println();
        System.out.println("Updated data: " + employee.name + ", $ " + employee.glossSalary);

        sc.close();
    }
}
