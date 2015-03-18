import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by DIMA on 14.03.2015.
 * in project LoadImage
 */
public class MainFrame extends JFrame  {
    private static LoadImg li;
    private ImgView picture;
    public static boolean button1pressed = false;
    //private JPanel picturePanel;
    private JButton loadImageButton;
    private JButton findButton;

    public MainFrame() {
        initComponents();
    }

    public void initComponents() {
        //picturePanel = new JPanel();
        loadImageButton = new JButton("Load image");
        findButton = new JButton("Find");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.setPreferredSize(new Dimension(200, 200));
        /*
        //===== picture frame =====
        li = new LoadImg();
        picturePanel.add(li);
        contentPane.add(picturePanel);
        picturePanel.setBounds(new Rectangle(new Point(5, 0), li.getPreferredSize()));
        contentPane.setPreferredSize(li.getPreferredSizeForFrame());
        */
        pack();

        //===== loadImageButton =====
        loadImageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadImageButtonPressed(e);
            }
        });
        contentPane.add(loadImageButton);
        loadImageButton.setBounds(new Rectangle(new Point(contentPane.getWidth() - 100, 60), loadImageButton.getPreferredSize()));

        //===== findButton =====
        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                findButtonPressed(e);
            }
        });
        contentPane.add(findButton);
        findButton.setBounds(new Rectangle(new Point(contentPane.getWidth() - 100, 120), findButton.getPreferredSize()));
    }

    private void loadImageButtonPressed(ActionEvent e) {
        // add file chooser HERE!!
        picture = new ImgView(null);                        // here must be file instead of null
    }

    private void findButtonPressed(ActionEvent e) {
        System.out.println("click");
        button1pressed = true;
        picture.f.repaint();
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Throwable e) {
            e.printStackTrace();
        }
        MainFrame mf = new MainFrame();
    }
}
