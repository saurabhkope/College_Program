// Q2. Write a program which define class Product with data member as id, name and price. Store
// the information of 5 products and Display the name of product having minimum price (Use array
// of object)

import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class ProductDemo2 {
    public static void main(String[] args) {
        // Create an array to store information for 5 products
        Product[] products = new Product[5];
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input product information
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter product information for Product " + (i + 1));
            
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            // Create a Product object and store it in the array
            products[i] = new Product(id, name, price);
        }

        // Find the product with the minimum price
        Product minPriceProduct = products[0];
        for (int i = 1; i < 5; i++) {
            if (products[i].price < minPriceProduct.price) {
                minPriceProduct = products[i];
            }
        }

        // Display the name of the product with the minimum price
        System.out.println("Product with the minimum price: " + minPriceProduct.name);

        // Close the Scanner
        scanner.close();
    }
}
