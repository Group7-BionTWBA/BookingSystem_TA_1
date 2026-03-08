package com.bookingapp;

public sealed abstract class Reservation permits FlightReservation, HotelReservation {
    protected int confirmationNumber;

    // Inisialisasi data dasar untuk reservasi
    public Reservation(int confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    // Mengambil nomor konfirmasi reservasi
    public int getConfirmationNumber() {
        return confirmationNumber;
    }

    // Method abstrak untuk menampilkan detail reservasi, diimplementasikan oleh
    // subclass
    public abstract void display();
}