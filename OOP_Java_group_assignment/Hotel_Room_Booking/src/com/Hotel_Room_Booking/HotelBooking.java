package com.Hotel_Room_Booking;

public class HotelBooking {
    public static void main(String[] args) {
        // Create room objects
        Room standard = new Room(101, "Standard", 2000);
        Room deluxe = new Room(201, "Deluxe", 5000);
        Room suite = new Room(301, "Suite", 10000);

       
        int nightsStayed = 6;
        double bill = deluxe.calculateCost(nightsStayed);

    
        System.out.println("Guest booked a " + deluxe.type + " room for " + nightsStayed + " nights.");
        System.out.println("Price per Night: " + deluxe.pricePerNight);
        System.out.println("Total Bill: " + bill);

        if (nightsStayed > 5) {
            System.out.println("15% Discount Applied.");
        } else {
            System.out.println("No Discount Applied.");
        }
    }
}