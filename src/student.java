import entities.Student;

import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Name: ");
        student.name = sc.next();
        System.out.print("Num 1: ");
        student.num1 = sc.nextDouble();

        System.out.print("Num 2: ");
        student.num2 = sc.nextDouble();

        System.out.print("Num 3: ");
        student.num3 = sc.nextDouble();

        double media = student.media();
        if(media > 60){
            System.out.println("Final Grade: " + String.format("%.2f", media));
            System.out.println("PASS");
        } else {
            System.out.println("Final Grade: " + String.format("%.2f", media));
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f", 60.00 - media) + " POINTS");
        }

        sc.close();
    }
}
