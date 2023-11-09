//Q2. Write a program that displays the number of characters, lines and words of a file

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileAnalysis3 {
    public static void main(String[] args) {
        String fileName = "data.txt"; // Replace with the path to your file

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;

                // Count characters
                charCount += line.length();

                // Count words
                String[] words = line.split("\\s+"); // Split by whitespace
                wordCount += words.length;
            }

            reader.close();

            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
