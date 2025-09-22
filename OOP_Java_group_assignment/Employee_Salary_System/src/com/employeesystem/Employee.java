package com.employeesystem;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    double calculateSalary() {
        return 0;
    }
}


class FullTimeEmployee extends Employee {
    double baseSalary;

    FullTimeEmployee(String name, double baseSalary) {
        super(name); 
        this.baseSalary = baseSalary;
    }

  
    double calculateSalary() {
        double allowance = 0.2 * baseSalary; // 
        return baseSalary + allowance;
    }
}


class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
