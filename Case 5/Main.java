
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
package com.case5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rectangle dimensions
        Rectangle rect = new Rectangle();
        System.out.print("Enter length of rectangle: ");
        rect.setLength(sc.nextDouble());
        System.out.print("Enter width of rectangle: ");
        rect.setWidth(sc.nextDouble());

        // Input circle dimensions
        Circle cir = new Circle();
        System.out.print("Enter radius of circle: ");
        cir.setRadius(sc.nextDouble());

        // Calculate areas
        double rectArea = rect.calculateArea();
        double cirArea = cir.calculateArea();

        // Compare areas using if condition
        if (rectArea > cirArea) {
            System.out.println("Rectangle has a larger area (" + rectArea + ") than Circle (" + cirArea + ")");
        } else if (cirArea > rectArea) {
            System.out.println("Circle has a larger area (" + cirArea + ") than Rectangle (" + rectArea + ")");
        } else {
            System.out.println("Both shapes have equal area (" + rectArea + ")");
        }

        sc.close();
    }
}