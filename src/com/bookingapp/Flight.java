package com.bookingapp;

public class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private String date;
    private double price;

    // Inisialisasi data untuk entitas penerbangan
    public Flight(String flightNumber, String origin, String destination, String date, double price) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.price = price;
    }

    // Mengambil nomor penerbangan
    public String getFlightNumber() {
        return flightNumber;
    }

    // Mengambil kota asal keberangkatan
    public String getOrigin() {
        return origin;
    }

    // Mengambil kota tujuan penerbangan
    public String getDestination() {
        return destination;
    }

    // Mengambil data tanggal keberangkatan
    public String getDate() {
        return date;
    }

    // Mengambil nilai harga tiket penerbangan
    public double getPrice() {
        return price;
    }

    // Format string untuk representasi informasi penerbangan
    @Override
    public String toString() {
        return flightNumber + " | " + origin + " -> " + destination + " | " + date + " | Rp" + price;
    }
}