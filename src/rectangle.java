import entities.Rectangle;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height:");
        System.out.print("Width: ");
        rectangle.width = sc.nextDouble();
        System.out.print("Height: ");
        rectangle.height = sc.nextDouble();
        System.out.println("AREA: " + rectangle.area());
        System.out.println("PERIMETER: " + rectangle.perimeter());
        System.out.println("DIAGONAL: " + rectangle.diagonal());

        sc.close();
    }
}
