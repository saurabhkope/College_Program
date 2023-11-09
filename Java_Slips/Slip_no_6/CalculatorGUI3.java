// Q2. Write a program to create the following GUI using Swing components.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI3 extends JFrame implements ActionListener {
    private JTextField textField;
    private String input;

    public CalculatorGUI3() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        input = "";
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4));

        String[] buttonLabels = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", "C", "=", "/","Clear"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("=")) {
            evaluateExpression();
        } else if (actionCommand.equals("C")) {
            clearInput();
        } else {
            input += actionCommand;
            textField.setText(input);
        }
    }

    private void evaluateExpression() {
        try {
            // You can implement the evaluation logic here.
            // For simplicity, we'll just display the result as text.
            String result = evaluate(input);
            textField.setText(result);
            input = result;
        } catch (Exception e) {
            textField.setText("Error");
            input = "";
        }
    }

    private void clearInput() {
        input = "";
        textField.setText("");
    }

    // You can implement the evaluation logic here
    private String evaluate(String expression) {
        try {
            // Use a library or custom code to evaluate the expression.
            // For simplicity, we'll return the input as is.
            return expression;
        } catch (Exception e) {
            return "Error";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculatorGUI3();
        });
    }
}
