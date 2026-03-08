package com.bookingapp;

public class Hotel {
    private String id;
    private String name;
    private String location;
    private double price;

    // Inisialisasi data untuk entitas hotel
    public Hotel(String id, String name, String location, double price) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.price = price;
    }

    // Mengambil nilai ID hotel
    public String getId() {
        return id;
    }

    // Mengambil nilai lokasi hotel
    public String getLocation() {
        return location;
    }

    // Mengambil nilai harga per malam hotel
    public double getPrice() {
        return price;
    }

    // Format string untuk menampilkan ringkasan informasi hotel
    @Override
    public String toString() {
        return id + " | " + name + " | " + location + " | Rp" + price;
    }
}