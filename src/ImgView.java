import javax.swing.*;
import java.io.File;

/**
 * Project LoadImage
 * ImgView class create new window with loaded picture on it.
 * @author Dima Halatenko
 * @version 1.0  18/03/2015
 */
public class ImgView {
    JFrame f = new JFrame("pict.name");

    /**
     * Constructor ImgView set parameters for picture window.
     * @param pict picture to be displayed.
     */
    public ImgView(File pict) {
        LoadImg li;
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        if (pict == null) {
            li = new LoadImg();
        }
        else {
            li = new LoadImg(pict);
        }
        f.add(li);

        /* call getPreferredSize() method for this frame */
        f.pack();
        f.setVisible(true);

    }
}
