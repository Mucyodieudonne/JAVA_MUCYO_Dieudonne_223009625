package com.Vehicle_Inheritance_Hierarchy;

public class VehicleManagement {
    public static void main(String[] args) {
        // Create objects
        Vehicle v1 = new Car("CAR123", 180, 15.0);
        Vehicle v2 = new Bike("BIKE456", 120, 40.0);
        Vehicle v3 = new Truck("TRUCK789", 100, 10.0);

        // Store them in an array
        Vehicle[] vehicles = {v1, v2, v3};

        // Loop to print details 
        System.out.println("=== Vehicle Details ===");
        for (Vehicle v : vehicles) {
            v.displayDetails(); 
        }
    }
}