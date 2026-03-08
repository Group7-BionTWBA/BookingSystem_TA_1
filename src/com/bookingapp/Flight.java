package com.bookingapp;

public class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private String date;
    private double price;

    public Flight(String flightNumber, String origin, String destination, String date, double price) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.price = price;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return flightNumber + " | " + origin + " -> " + destination + " | " + date + " | Rp" + price;
    }
}