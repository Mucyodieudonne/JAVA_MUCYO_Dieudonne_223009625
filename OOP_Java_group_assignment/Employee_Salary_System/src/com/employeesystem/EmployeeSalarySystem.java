package com.employeesystem;

public class EmployeeSalarySystem {
    public static void main(String[] args) {
   
        FullTimeEmployee emp1 = new FullTimeEmployee("Alice", 50000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Bob", 120, 300);

        double salary1 = emp1.calculateSalary();
        double salary2 = emp2.calculateSalary();

       
        System.out.println(emp1.name + "'s Salary: " + salary1);
        if (salary1 > 60000) {
            System.out.println(emp1.name + " is a High Earner");
        }

        System.out.println(emp2.name + "'s Salary: " + salary2);
        if (salary2 > 60000) {
            System.out.println(emp2.name + " is a High Earner");
        }

       
        double total = salary1 + salary2;
        System.out.println("Total Salary Expenditure: " + total);
    }
}