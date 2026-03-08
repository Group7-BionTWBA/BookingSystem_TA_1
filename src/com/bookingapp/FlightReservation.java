package com.bookingapp;

public final class FlightReservation extends Reservation {
    private Flight flight;
    private String passengerName;

    public FlightReservation(int confirmationNumber, Flight flight, String passengerName) {
        super(confirmationNumber);
        this.flight = flight;
        this.passengerName = passengerName;
    }

    @Override
    public void display() {
        System.out.println("Flight Reservation #" + confirmationNumber +
                " for " + passengerName + " | " + flight);
    }
}