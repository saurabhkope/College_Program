// Q1. Write a program to accept the 'n' different numbers from user and store it in array. Display
// maximum number from an array.

import java.util.Scanner;

public class MaxNumberInArray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive number of elements.");
        } else {
            int[] numbers = new int[n];
            
            for (int i = 0; i < n; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }
            
            int max = numbers[0];
            
            for (int i = 1; i < n; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            
            System.out.println("Maximum number in the array: " + max);
        }
        
        scanner.close();
    }
}
