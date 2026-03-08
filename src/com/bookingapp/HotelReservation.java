package com.bookingapp;

public final class HotelReservation extends Reservation {
    private Hotel hotel;
    private String guestName;

    public HotelReservation(int confirmationNumber, Hotel hotel, String guestName) {
        super(confirmationNumber);
        this.hotel = hotel;
        this.guestName = guestName;
    }

    @Override
    public void display() {
        System.out.println("Hotel Reservation #" + confirmationNumber +
                " for " + guestName + " | " + hotel);
    }
}