package com.shape_area_calculator;

public class ShapeAreaCalculator {
    public static void main(String[] args) {
      
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(10, 6);
        Shape s3 = new Triangle(8, 4);

        // Store shapes in an array
        Shape[] shapes = {s1, s2, s3};


        double totalArea = 0;
        for (Shape s : shapes) {
            double a = s.area(); 
            System.out.println("Area = " + a);
            totalArea += a;
        }

        System.out.println("Total Area of All Shapes = " + totalArea);
    }
}