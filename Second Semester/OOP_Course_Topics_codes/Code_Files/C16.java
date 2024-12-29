// Event Handing 

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C16 {
    public static void main(String[] args) {
        // Create the main window
        JFrame frame = new JFrame("Event Handling Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  // Absolute positioning

        // Create a button (Event Source)
        JButton button = new JButton("Click Me");
        button.setBounds(50, 50, 100, 30); // Position the button

        // Create and add an ActionListener (Event Listener)
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to handle the button click event
                JOptionPane.showMessageDialog(frame, "Button clicked!");
            }
        });

        // Add the button to the frame
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);
    }
}
