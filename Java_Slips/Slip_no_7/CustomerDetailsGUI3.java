// Q2. Write a program to design the following GUI using Swing components. On click of submit
// button check whether user has entered all the details or not. If any details are missing then display
// appropriate message on screen using label

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerDetailsGUI3 extends JFrame implements ActionListener {
    private JTextField nameField, bankField, accountField, panField;
    private JLabel nameLabel, bankLabel, accountLabel, panLabel, messageLabel;

    public CustomerDetailsGUI3() {
        setTitle("Customer Account Details");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        nameLabel = new JLabel("Name of Customer: ");
        nameField = new JTextField();
        panel.add(nameLabel);
        panel.add(nameField);

        bankLabel = new JLabel("Name of Bank: ");
        bankField = new JTextField();
        panel.add(bankLabel);
        panel.add(bankField);

        accountLabel = new JLabel("Account No: ");
        accountField = new JTextField();
        panel.add(accountLabel);
        panel.add(accountField);

        panLabel = new JLabel("Pan Number: ");
        panField = new JTextField();
        panel.add(panLabel);
        panel.add(panField);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        panel.add(submitButton);

        add(panel, BorderLayout.CENTER);

        messageLabel = new JLabel("");
        messageLabel.setForeground(Color.RED);
        add(messageLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String bank = bankField.getText();
        String account = accountField.getText();
        String pan = panField.getText();

        if (name.isEmpty() || bank.isEmpty() || account.isEmpty() || pan.isEmpty()) {
            messageLabel.setText("Please enter all details.");
        } else {
            messageLabel.setText("Details submitted successfully!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CustomerDetailsGUI3();
        });
    }
}
