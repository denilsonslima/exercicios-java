package entities;

public class Employee {
    public String name;
    public double glossSalary;
    public double tax;

    public double netSalary(){
        glossSalary -= tax;
        return glossSalary;
    }

    public void increaseSalary(double percentage){
        glossSalary = glossSalary + (percentage / 100) * glossSalary;
    }

}
