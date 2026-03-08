package com.bookingapp;

import java.util.*;

public class BookingApp {
    private List<Flight> flights = new ArrayList<>();
    private List<Hotel> hotels = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();
    private Random random = new Random();

    public BookingApp() {
        flights.add(new Flight("GA123", "Jakarta", "Bali", "2026-03-10", 1500000));
        flights.add(new Flight("JT456", "Jakarta", "Surabaya", "2026-03-12", 1000000));
        hotels.add(new Hotel("H001", "Hotel Indonesia Kempinski", "Jakarta", 2500000));
        hotels.add(new Hotel("H002", "The Mulia", "Bali", 8000000));
    }

    public void searchFlights(String origin, String destination) {
        flights.stream()
                .filter(f -> f.getOrigin().equalsIgnoreCase(origin)
                        && f.getDestination().equalsIgnoreCase(destination))
                .forEach(System.out::println);
    }

    public void searchHotels(String location) {
        hotels.stream()
                .filter(h -> h.getLocation().equalsIgnoreCase(location))
                .forEach(System.out::println);
    }

    public void bookFlight(String flightNumber, String passengerName) {
        flights.stream()
                .filter(f -> f.getFlightNumber().equalsIgnoreCase(flightNumber))
                .findFirst()
                .ifPresentOrElse(f -> {
                    int conf = random.nextInt(900000) + 100000;
                    reservations.add(new FlightReservation(conf, f, passengerName));
                    System.out.println("Flight booked! Confirmation #" + conf);
                }, () -> System.out.println("Flight not found."));
    }

    public void bookHotel(String hotelId, String guestName) {
        hotels.stream()
                .filter(h -> h.getId().equalsIgnoreCase(hotelId))
                .findFirst()
                .ifPresentOrElse(h -> {
                    int conf = random.nextInt(900000) + 100000;
                    reservations.add(new HotelReservation(conf, h, guestName));
                    System.out.println("Hotel booked! Confirmation #" + conf);
                }, () -> System.out.println("Hotel not found."));
    }

    public void cancelReservation(int confirmationNumber) {
        boolean removed = reservations.removeIf(res -> res.getConfirmationNumber() == confirmationNumber);
        if (removed) {
            System.out.println("Reservation #" + confirmationNumber + " cancelled.");
        } else {
            System.out.println("Reservation not found.");
        }
    }

    public void viewReservations() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
        } else {
            reservations.forEach(Reservation::display);
        }
    }

    public Flight findFlightByNumber(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equalsIgnoreCase(flightNumber)) {
                return flight;
            }
        }
        return null;
    }

    public Hotel findHotelById(String hotelId) {
        for (Hotel hotel : hotels) {
            if (hotel.getId().equalsIgnoreCase(hotelId)) {
                return hotel;
            }
        }
        return null;
    }

    public Reservation findReservationById(int confirmationNumber) {
        for (Reservation reservation : reservations) {
            if (reservation.getConfirmationNumber() == confirmationNumber) {
                return reservation;
            }
        }
        return null;
    }
}