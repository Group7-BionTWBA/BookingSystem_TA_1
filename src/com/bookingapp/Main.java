package com.bookingapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookingApp app = new BookingApp();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1) Search Flights");
            System.out.println("2) Search Hotels");
            System.out.println("3) Book Flight");
            System.out.println("4) Book Hotel");
            System.out.println("5) Cancel Reservation");
            System.out.println("6) View Reservations");
            System.out.println("7) Exit");
            System.out.println();

            try {
                int choice = InputValidator.getIntInput(sc, "Choose option: ");

                switch (choice) {
                    case 1 -> {
                        String origin = InputValidator.getStringInput(sc, "Origin: ");
                        String dest = InputValidator.getStringInput(sc, "Destination: ");
                        app.searchFlights(origin, dest);
                    }
                    case 2 -> {
                        String loc = InputValidator.getStringInput(sc, "Location: ");
                        app.searchHotels(loc);
                    }
                    case 3 -> {
                        String fn = InputValidator.getStringInput(sc, "Flight Number: ");
                        String pn = InputValidator.getStringInput(sc, "Passenger Name: ");
                        app.bookFlight(fn, pn);
                    }
                    case 4 -> {
                        String hid = InputValidator.getStringInput(sc, "Hotel ID: ");
                        String gn = InputValidator.getStringInput(sc, "Guest Name: ");
                        app.bookHotel(hid, gn);
                    }
                    case 5 -> {
                        int cn = InputValidator.getIntInput(sc, "Confirmation Number: ");
                        app.cancelReservation(cn);
                    }
                    case 6 -> app.viewReservations();
                    case 7 -> {
                        System.out.println("Goodbye!");
                        return;
                    }
                    default -> System.out.println("Invalid choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a number.");
                sc.nextLine();
            }
        }
    }
}