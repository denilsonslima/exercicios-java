import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        System.out.println();

        List<Integer> ids = new ArrayList<>();
        List<String> names = new ArrayList<>();
        List<Double> salarys = new ArrayList<>();


        for (int i = 1; i <= n; i++){
            System.out.println("Emplyoee #" + i +" : ");
            System.out.print("Id: ");
            int id = sc.nextInt();
            ids.add(id);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            names.add(name);
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            salarys.add(salary);
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt();
        int exist = ids.indexOf(id);
        if(exist != -1){
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            double element = salarys.get(exist);
            salarys.set(exist, element * 1.10);
        } else {
            System.out.println("This id does not exist!");
        }

        System.out.println();
        System.out.println("List of employees:");
        for (int i = 0; i < n; i++){
            System.out.println(ids.get(i) + ", " + names.get(i) + ", " + String.format("%.2f", salarys.get(i)));
        }


        sc.close();
    }
}
