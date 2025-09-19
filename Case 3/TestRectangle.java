
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
package com.case3;
import java.util.Scanner;
public class TestRectangle {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array to store 3 rectangles
        Rectangle[] rectangles = new Rectangle[3];

        // Input 3 rectangles’ dimensions
        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle(); // create a new rectangle object

            System.out.print("Enter length of rectangle " + (i + 1) + ": ");
            rectangles[i].setLength(sc.nextDouble());

            System.out.print("Enter width of rectangle " + (i + 1) + ": ");
            rectangles[i].setWidth(sc.nextDouble());
        }

        // Print the area of each rectangle
        System.out.println("\nAreas of rectangles:");
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Rectangle " + (i + 1) + " area = " + rectangles[i].calculateArea());
        }

        sc.close();
    }
}