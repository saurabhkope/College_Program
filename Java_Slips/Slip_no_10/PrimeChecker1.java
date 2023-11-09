//Q1. Write a program to accept a number from user. Check whether number is prime or not.

import java.util.Scanner;

public class PrimeChecker1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime and display the result
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible, so it's not prime
            }
        }

        return true; // Number is prime
    }
}
