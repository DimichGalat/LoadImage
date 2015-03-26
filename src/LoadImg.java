import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 * Project LoadImage
 * LoadImg class provide logic of loading new image.
 * There are two constructors: default and specified.
 * If no image will be chosen default image is loads.
 * @author Dima Halatenko
 * @version 1.0  18/03/2015
 */
public class LoadImg extends JComponent {

    /** img keep buffered image which can be processed*/
    BufferedImage img;

    /**
     * Default constructor: loads default image.
     */
    public LoadImg() {
        try {
            img = ImageIO.read(new File("revox.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Constructor loads image from chosen file.
     * @param f file chosen by JFileChooser.
     */
    public LoadImg(File f) {
        try {
            img = ImageIO.read(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * paintComponent point into area searched by algorithm
     * @param g keep graphics parameters of this component
     */
    public void paintComponent(Graphics g) {
        //super.paintComponent(g);                  // panel.repaint() work without this line
        g.drawImage(img, 0, 0, null);               // draw loaded image on the component
        if (MainFrame.button1pressed) {             // point at found area
            g.setColor(Color.GREEN);
            g.drawRect(100, 100, 100, 100);
        }
    }

    /**
     * getPreferredSize() fit window bounds to the picture size.
     * @return window dimension & loaded image size.
     */
    public Dimension getPreferredSize() {
        if (img == null) {
            return new Dimension(100,100);
        } else {
            return new Dimension(img.getWidth(), img.getHeight());
        }
    }

    /**
     * getPreferredSizeForFrame() - not used method
     * @return window dimension & loaded image size.
     */
    public Dimension getPreferredSizeForFrame() {
        if (img == null) {
            return new Dimension(100,100);
        } else {
            return new Dimension(img.getWidth() + 200, img.getHeight() + 5);
        }
    }

    /**
     * calcLogic calculate modulo x % y
     * Use just to run tests
     * @param x first parameter
     * @param y second parameter
     * @return x%y
     */
    public static int calcLogic (int x, int y) {
        return 0;
    }
}
