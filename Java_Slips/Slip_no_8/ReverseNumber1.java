// Q1. Write a program to reverse a number. Accept number using command line argument

public class ReverseNumber1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ReverseNumber <number>");
            return;
        }

        // Parse the command line argument as an integer
        int number = Integer.parseInt(args[0]);

        // Reverse the number
        int reversedNumber = reverse(number);

        // Print the reversed number
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}
