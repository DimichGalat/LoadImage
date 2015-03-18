import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 * Created by DIMA on 14.03.2015.
 * in project LoadImage
 */
public class LoadImg extends JComponent {
    BufferedImage img;

    public LoadImg() {
        try {
            img = ImageIO.read(new File("revox.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void paintComponent(Graphics g) {
        //super.paintComponent(g);                  // panel.repaint() work without this line
        g.drawImage(img, 0, 0, null);               // draw loaded image on the component
        if (MainFrame.button1pressed) {             // point at found area
            g.setColor(Color.GREEN);
            g.drawRect(100, 100, 100, 100);
        }
    }

    public Dimension getPreferredSize() {           // return the loaded image size
        if (img == null) {
            return new Dimension(100,100);
        } else {
            return new Dimension(img.getWidth(), img.getHeight());
        }
    }
    public Dimension getPreferredSizeForFrame() {
        if (img == null) {
            return new Dimension(100,100);
        } else {
            return new Dimension(img.getWidth() + 200, img.getHeight() + 5);
        }
    }
}
