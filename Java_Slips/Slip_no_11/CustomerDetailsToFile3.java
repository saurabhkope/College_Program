// Q2. Write a program to accept details of 'n' customers (c_id, cname, address, mobile_no) from
// user and store it in a file using DataOutputStream class.

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Customer {
    int c_id;
    String cname;
    String address;
    String mobile_no;

    public Customer(int c_id, String cname, String address, String mobile_no) {
        this.c_id = c_id;
        this.cname = cname;
        this.address = address;
        this.mobile_no = mobile_no;
    }
}

public class CustomerDetailsToFile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of customers (n): ");
        int n = scanner.nextInt();

        List<Customer> customers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for Customer " + i);
            System.out.print("Customer ID: ");
            int c_id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Customer Name: ");
            String cname = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Mobile Number: ");
            String mobile_no = scanner.nextLine();

            customers.add(new Customer(c_id, cname, address, mobile_no));
        }

        // Write customer details to a file using DataOutputStream
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("customer_details.txt"))) {
            for (Customer customer : customers) {
                dos.writeInt(customer.c_id);
                dos.writeUTF(customer.cname);
                dos.writeUTF(customer.address);
                dos.writeUTF(customer.mobile_no);
            }
            System.out.println("Customer details written to file 'customer_details.txt'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
