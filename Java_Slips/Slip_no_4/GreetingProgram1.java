// Q1. Write a program to accept the user name and greets the user by name. Before displaying the 
// user's name, convert it to upper case letters. For example, if the user's name is Raj, then display
// greet message as "Hello, RAJ, nice to meet you!". 

import java.util.Scanner;

public class GreetingProgram1 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Please enter your name: ");

        // Read the user's name as input
        String userName = scanner.nextLine();

        // Convert the user's name to uppercase
        String userNameUpper = userName.toUpperCase();

        // Greet the user with the uppercase name
        String greetMessage = "Hello, " + userNameUpper + ", nice to meet you!";
        System.out.println(greetMessage);

        // Close the Scanner
        scanner.close();
    }
}
