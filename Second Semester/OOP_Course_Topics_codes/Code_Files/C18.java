//// Creating a Simple Window Program

import java.awt.*;

public class C18 {
    public static void main(String[] args) {
        // Create a frame (window)
        Frame frame = new Frame("Simple AWT Window");

        // Set the size of the frame
        frame.setSize(400, 300);

        // Make the frame visible
        frame.setVisible(true);

        // Set the operation when the window is closed
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent we) {
                System.exit(0);  // Exit the application when the window is closed
            }
        });
    }
}
