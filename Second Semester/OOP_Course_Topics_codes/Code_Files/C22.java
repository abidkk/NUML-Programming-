// Control Fundamentals 

import java.awt.*;
import java.awt.event.*;

public class C22 {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("Control Example");

        // Create a label
        Label label = new Label("Enter your name:");
        label.setBounds(50, 50, 150, 30);

        // Create a text field
        TextField textField = new TextField();
        textField.setBounds(50, 100, 200, 30);

        // Create a button
        Button button = new Button("Submit");
        button.setBounds(50, 150, 100, 30);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();  // Get the text from the text field
                label.setText("Hello, " + name + "!");
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);

        // Set layout to null (absolute positioning)
        frame.setLayout(null);

        // Set frame size and make it visible
        frame.setSize(300, 250);
        frame.setVisible(true);

        // Close operation
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
