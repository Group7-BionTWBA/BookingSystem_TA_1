package com.bookingapp;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputValidator {

    // Meminta input angka dari pengguna dan menangani jika input tidak valid
    public static int getIntInput(Scanner scanner, String message) {
        int input = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(message);
            try {
                input = scanner.nextInt();
                scanner.nextLine();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }

        return input;
    }

    // Meminta input teks dari pengguna dan memastikan input tidak kosong
    public static String getStringInput(Scanner scanner, String message) {
        String input;

        while (true) {
            System.out.print(message);
            input = scanner.nextLine();

            if (!input.trim().isEmpty()) {
                return input;
            } else {
                System.out.println("Input cannot be empty. Please try again.");
            }
        }
    }
}