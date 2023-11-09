// Q1. Write a program to accept a number from user. Check whether number is perfect or not.
// Use BufferedReader class for accepting input from user

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumber1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Accept a number from the user
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(br.readLine());

        // Check if the number is perfect and display the result
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }

        int sumOfDivisors = 1; // 1 is a divisor of every number

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
                if (i != number / i) {
                    sumOfDivisors += number / i;
                }
            }
        }

        return sumOfDivisors == number;
    }
}
