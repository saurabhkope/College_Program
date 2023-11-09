// Q1. Define a class MyNumber having one private integer data member. Write a parameterized
// constructor to initialize to a value. Write isOdd() to check given number is odd or not. Use command
// line argument to pass a value to the object.

public class MyNumber1 {
    private int number;

    public MyNumber1(int number) {
        this.number = number;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single integer command line argument.");
            return;
        }

        try {
            int value = Integer.parseInt(args[0]);
            MyNumber1 myNumber = new MyNumber1(value);

            if (myNumber.isOdd()) {
                System.out.println(value + " is an odd number.");
            } else {
                System.out.println(value + " is not an odd number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer.");
        }
    }
}
