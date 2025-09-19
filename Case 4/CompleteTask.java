
/***
=======Names==========
1)MUCYO Dieudonne 223009625
2)UZABAKIRIHO Theogene 223009518
3)IHIMBAZWE Genevieve 223014976
4)NIYOGISUBIZO Benoit 223007262
5)IKIREZI Denyse 223015956
6)UWASHEMA Victorine 223012958
7) UMWARI Justine
***/
package com.case4;
import java.util.Scanner;
public class CompleteTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Rectangle
                Rectangle rect = new Rectangle();
                System.out.print("Enter length: ");
                rect.setLength(sc.nextDouble());
                System.out.print("Enter width: ");
                rect.setWidth(sc.nextDouble());
                System.out.println("Area of rectangle = " + rect.calculateArea());
                break;

            case 2:
                // Circle
                circle cir = new circle();
                System.out.print("Enter Radius: ");
                cir.setRadius(sc.nextDouble());
                System.out.println("Area of circle = " + cir.calculateArea());
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}