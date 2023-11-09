import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgrammingLanguageGUI3 extends JFrame implements ActionListener {
    private JLabel label;
    private JComboBox<String> languageComboBox;
    private JButton showButton;

    public ProgrammingLanguageGUI3() {
        setTitle("Programming Language Selector");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Selected Programming Language: ");
        languageComboBox = new JComboBox<>(new String[]{"Java", "Python", "C++", "JavaScript"});
        showButton = new JButton("Show");

        showButton.addActionListener(this);

        add(languageComboBox);
        add(showButton);
        add(label);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == showButton) {
            String selectedLanguage = (String) languageComboBox.getSelectedItem();
            label.setText("Selected Programming Language: " + selectedLanguage);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ProgrammingLanguageGUI3();
        });
    }
}
