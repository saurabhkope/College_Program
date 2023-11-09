// Q1. Create a package named “Series” having a class to print series of Square of numbers. Write a
// program to generate “n” terms series. 

import series.SquareSeries;
import java.util.Scanner;

public class SquareSeriesExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms (n) for the square series: ");
        int n = scanner.nextInt();

        SquareSeries series = new SquareSeries();
        System.out.print("Square Series: ");
        series.generateSeries(n);
    }
}
