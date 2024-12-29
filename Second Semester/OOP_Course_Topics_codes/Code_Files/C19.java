//  Working with Graphics

import java.awt.*;

public class C19 extends Frame {
    public C19() {
        setTitle("Graphics Example");
        setSize(400, 300);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        // Drawing a rectangle
        g.setColor(Color.BLUE);  // Set the color to blue
        g.fillRect(50, 50, 100, 100);  // Draw a filled rectangle

        // Drawing text
        g.setColor(Color.RED);  // Set the color to red
        g.drawString("Hello, AWT Graphics!", 50, 200);  // Draw some text
    }

    public static void main(String[] args) {
        new C19();
    }
}
