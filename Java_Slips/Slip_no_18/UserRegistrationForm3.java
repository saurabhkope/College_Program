//Q2. Write a program to design following screen using swing components

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserRegistrationForm3 extends JFrame {
    private JLabel lblFirstName, lblLastName, lblEmail, lblMobile, lblUsername, lblPassword;
    private JTextField txtFirstName, txtLastName, txtEmail, txtMobile, txtUsername, txtPassword;
    private JButton btnRegister;

    public UserRegistrationForm3() {
        setTitle("User Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 10, 10));

        lblFirstName = new JLabel("First Name:");
        lblLastName = new JLabel("Last Name:");
        lblEmail = new JLabel("Email Address:");
        lblMobile = new JLabel("Mobile Number:");
        lblUsername = new JLabel("Username:");
        lblPassword = new JLabel("Password:");

        txtFirstName = new JTextField(20);
        txtLastName = new JTextField(20);
        txtEmail = new JTextField(20);
        txtMobile = new JTextField(20);
        txtUsername = new JTextField(20);
        txtPassword = new JPasswordField(20);

        btnRegister = new JButton("Register");
        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle registration logic here
                // You can access the input fields like txtFirstName.getText(), txtLastName.getText(), etc.
                // Perform necessary validation and registration process.
            }
        });

        add(lblFirstName);
        add(txtFirstName);
        add(lblLastName);
        add(txtLastName);
        add(lblEmail);
        add(txtEmail);
        add(lblMobile);
        add(txtMobile);
        add(lblUsername);
        add(txtUsername);
        add(lblPassword);
        add(txtPassword);
        add(new JLabel()); // Empty Label for spacing
        add(btnRegister);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new UserRegistrationForm3();
            }
        });
    }
}
