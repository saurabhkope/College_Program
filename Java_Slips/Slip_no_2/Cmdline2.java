// Q2. Define a class MyNumber having one private integer data member. Write a default constructor 
// initialize it to 0 and another constructor to initialize it to a value. Write methods isNegative, 
// isPositive, isOdd, iseven. Use command line argument to pass a value to the object and perform
// the above operations. 
import java.util.*;

class Cmdline2 {
    private int mynum;

    Cmdline2() {
        this.mynum = 0;
    }

    Cmdline2(int a) {
        this.mynum = a;
    }

    public boolean iseven() {
        return mynum % 2 == 0;
    }

    public boolean isodd() {
        return mynum % 2 != 0;
    }

    public boolean ispositive() {
        return mynum > 0;
    }

    public boolean isnegative() {
        return mynum < 0;
    }

    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Enter the my num:");
            return;
        }

        try {
            int a = Integer.parseInt(args[0]);
            Cmdline2 d = new Cmdline2(a);
            System.out.println("My number is: " + d.mynum);
            System.out.println("Is even: " + d.iseven());
            System.out.println("Is odd: " + d.isodd());
            System.out.println("Is positive: " + d.ispositive());
            System.out.println("Is negative: " + d.isnegative());
        } catch (NumberFormatException e) {
            System.out.println("valid integer as a command line argument.");
        }
    }
}