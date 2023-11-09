// Q2. Create an abstract class “order” having members id, description. Create a subclass
// “Purchase Order” having member as customer name. Define methods accept and display.
// Create 3 objects each of Purchase Order. Accept and display the details.

import java.util.Scanner;

abstract class Order {
    protected int id;
    protected String description;

    public abstract void accept();
    public abstract void display();
}

class PurchaseOrder extends Order {
    private String customerName;

    @Override
    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Order ID: ");
        id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Order Description: ");
        description = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        customerName = scanner.nextLine();
    }

    @Override
    public void display() {
        System.out.println("Order ID: " + id);
        System.out.println("Order Description: " + description);
        System.out.println("Customer Name: " + customerName);
    }
}

public class Main2 {
    public static void main(String[] args) {
        PurchaseOrder[] orders = new PurchaseOrder[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Purchase Order " + (i + 1) + ":");
            orders[i] = new PurchaseOrder();
            orders[i].accept();
        }

        System.out.println("\nDisplaying Purchase Orders:\n");
        for (PurchaseOrder order : orders) {
            order.display();
            System.out.println();
        }
    }
}
