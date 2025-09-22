package com.Vehicle_Inheritance_Hierarchy;

class Vehicle {
    String registrationNumber;
    double speed;

    Vehicle(String registrationNumber, double speed) {
        this.registrationNumber = registrationNumber;
        this.speed = speed;
    }

    // Method to display details 
    void displayDetails() {
        System.out.println("Vehicle Reg: " + registrationNumber + ", Speed: " + speed + " km/h");
    }
}

// Subclass for Car
class Car extends Vehicle {
    double fuelEfficiency; 

    Car(String registrationNumber, double speed, double fuelEfficiency) {
        super(registrationNumber, speed); // call parent constructor
        this.fuelEfficiency = fuelEfficiency;
    }

  
    void displayDetails() {
        System.out.println("Car Reg: " + registrationNumber + ", Speed: " + speed + " km/h, Fuel Efficiency: " + fuelEfficiency + " km/l");
    }
}


class Bike extends Vehicle {
    double fuelEfficiency;

    Bike(String registrationNumber, double speed, double fuelEfficiency) {
        super(registrationNumber, speed);
        this.fuelEfficiency = fuelEfficiency;
    }

  
    void displayDetails() {
        System.out.println("Bike Reg: " + registrationNumber + ", Speed: " + speed + " km/h, Fuel Efficiency: " + fuelEfficiency + " km/l");
    }
}

// Subclass for Truck
class Truck extends Vehicle {
    double loadCapacity; 

    Truck(String registrationNumber, double speed, double loadCapacity) {
        super(registrationNumber, speed);
        this.loadCapacity = loadCapacity;
    }

  
    void displayDetails() {
        System.out.println("Truck Reg: " + registrationNumber + ", Speed: " + speed + " km/h, Capacity: " + loadCapacity + " tons");
    }
}
