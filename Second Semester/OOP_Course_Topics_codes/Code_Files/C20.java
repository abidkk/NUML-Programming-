//  Layout Manager

import java.awt.*;
import java.awt.event.*;

public class C20 {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("FlowLayout Example");

        // Set the layout manager to FlowLayout
        frame.setLayout(new FlowLayout());

        // Create some buttons
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        // Add buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        // Set frame size and make it visible
        frame.setSize(300, 100);
        frame.setVisible(true);

        // Close operation
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
