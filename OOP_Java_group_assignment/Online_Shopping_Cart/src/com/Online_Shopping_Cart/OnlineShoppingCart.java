package com.Online_Shopping_Cart;

public class OnlineShoppingCart {
    public static void main(String[] args) {
        
        Product[] products = {
            new Product("P001", "Laptop", 40000, 1),
            new Product("P002", "Mouse", 1000, 2),
            new Product("P003", "Keyboard", 3000, 1)
        };

      
        double totalCost = 0;
        for (Product p : products) {
            double cost = p.calculateCost();
            System.out.println(p.name + " (" + p.quantity + " × " + p.price + ") = " + cost);
            totalCost += cost;
        }

      
        boolean discountApplied = false;
        if (totalCost > 10000) {
            totalCost = totalCost * 0.9; // 10% discount
            discountApplied = true;
        }

       
        System.out.println("\nFinal Bill: " + totalCost);
        if (discountApplied) {
            System.out.println("Discount applied (10%).");
        } else {
            System.out.println("No discount applied.");
        }
    }
}