//  Graphical User Interface using Swing.
//  Component:  Controls Button, Labels, Text Fields, Text Area, Checkbox and Radio buttons

import javax.swing.*;

public class C15 {
    public static void main(String[] args) {
        // Create the main window (JFrame)
        JFrame frame = new JFrame("Simple GUI Example");
        frame.setSize(300, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Using absolute positioning

        // Label Component
        JLabel label = new JLabel("Enter your name:");
        label.setBounds(50, 20, 200, 30);
        frame.add(label);

        // Text Field Component
        JTextField textField = new JTextField();
        textField.setBounds(50, 60, 200, 30);
        frame.add(textField);

        // Text Area Component
        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 100, 200, 60);
        frame.add(textArea);

        // Checkbox Component
        JCheckBox checkBox = new JCheckBox("I accept the terms and conditions");
        checkBox.setBounds(50, 170, 200, 30);
        frame.add(checkBox);

        // Radio Button Components
        JRadioButton radioButton1 = new JRadioButton("Male");
        JRadioButton radioButton2 = new JRadioButton("Female");
        radioButton1.setBounds(50, 210, 100, 30);
        radioButton2.setBounds(150, 210, 100, 30);

        // Grouping radio buttons so only one can be selected
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        frame.add(radioButton1);
        frame.add(radioButton2);

        // Button Component
        JButton button = new JButton("Submit");
        button.setBounds(50, 250, 200, 30);
        button.addActionListener(e -> {
            // Show the entered information when the button is clicked
            String name = textField.getText();
            String details = textArea.getText();
            boolean termsAccepted = checkBox.isSelected();
            String gender = radioButton1.isSelected() ? "Male" : "Female";

            String message = "Name: " + name + "\nDetails: " + details + "\nAccepted Terms: " + termsAccepted + "\nGender: " + gender;
            JOptionPane.showMessageDialog(frame, message);
        });
        frame.add(button);

        // Make the window visible
        frame.setVisible(true);
    }
}
