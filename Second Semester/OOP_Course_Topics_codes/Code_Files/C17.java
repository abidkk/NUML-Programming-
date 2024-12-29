//// AWT, AWT classes


import java.awt.*;
import java.awt.event.*;

public class C17 {
    public static void main(String[] args) {
        // Create a frame (window)
        Frame frame = new Frame("AWT Example");

        // Create a label to display messages
        Label label = new Label("Hello, AWT!");
        label.setBounds(50, 50, 150, 30); // Set position and size

        // Create a button
        Button button = new Button("Click Me");
        button.setBounds(50, 100, 100, 30);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!"); // Change label text when button is clicked
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(button);

        // Set the layout to null for absolute positioning
        frame.setLayout(null);

        // Set size of the frame and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Close the frame when the close button is pressed
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0); // Exit the application
            }
        });
    }
}
