//  Graphical User Interface using Swing.
//  Component:  Controls Button


import javax.swing.*;

public class C14 {
    public static void main(String[] args) {
        // Create the main window
        JFrame frame = new JFrame("Button Example");
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button
        JButton button = new JButton("Click Me");
        button.setBounds(50, 50, 100, 30); // Set position and size

        // Add action when the button is clicked
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button clicked!"));

        // Add the button to the window
        frame.setLayout(null); // No layout manager
        frame.add(button);

        // Make the window visible
        frame.setVisible(true);
    }
}
