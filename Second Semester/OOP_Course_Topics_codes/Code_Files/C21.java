//// Working with Menus

import java.awt.*;
import java.awt.event.*;

public class C21 {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("Menu Example");

        // Create a menu bar
        MenuBar menuBar = new MenuBar();

        // Create a menu
        Menu fileMenu = new Menu("File");

        // Create menu items
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        // Add menu items to the menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();  // Adds a separator between items
        fileMenu.add(exitItem);

        // Add menu to the menu bar
        menuBar.add(fileMenu);

        // Set the menu bar for the frame
        frame.setMenuBar(menuBar);

        // Add action listener to the exit item
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);  // Exit the application when 'Exit' is clicked
            }
        });

        // Set frame size and make it visible
        frame.setSize(400, 300);
        frame.setVisible(true);

        // Close operation
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
