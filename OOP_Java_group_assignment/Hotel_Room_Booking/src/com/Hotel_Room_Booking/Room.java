package com.Hotel_Room_Booking;

class Room {
    int roomNumber;
    String type;
    double pricePerNight;

    // Constructor
    Room(int roomNumber, String type, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
    }

    // Method to calculate cost
    double calculateCost(int nights) {
        double total = pricePerNight * nights;

        
        if (nights > 5) {
            total = total * 0.85; // apply discount
        }

        return total;
    }
}
