import javax.swing.*;
import java.io.File;

/**
 * Created by DIMA on 18.03.2015.
 * in project LoadImage
 */
public class ImgView {
    JFrame f = new JFrame("pict.name");
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
        f.pack();                   //call getPreferredSize() method for this frame
        f.setVisible(true);

    }
}
