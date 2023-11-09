// Q2. Write a program to copy the contents from one file into another file in upper case.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileToUpperCase {
    public static void main(String[] args) {
        String sourceFileName = "/home/sktech/Desktop/source.txt"; // Replace with your source file name
        String destinationFileName = "/home/sktech/Desktop/TYBCA_Slips/Java_Slips/Slip_no_3/destination.txt"; // Replace with your destination file name

        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName));

            String line;
            while ((line = reader.readLine()) != null) {
                String upperCaseLine = line.toUpperCase();
                writer.write(upperCaseLine);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("File copied in upper case successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
