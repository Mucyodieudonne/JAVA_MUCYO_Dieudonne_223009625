package com.Online_Shopping_Cart;

class Product {
    String productId;
    String name;
    double price;
    int quantity;

    // Constructor
    Product(String productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate cost of this product
    double calculateCost() {
        return price * quantity;
    }
}
