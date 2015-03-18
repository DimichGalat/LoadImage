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
    public static boolean button1pressed = false;
    private JPanel picturePanel;
    private JButton button1;

    public MainFrame() {
        initComponents();
        // where to add file chooser ???
    }

    public void initComponents() {
        picturePanel = new JPanel();
        button1 = new JButton("Click");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //===== picturePanel =====
        li = new LoadImg();
        picturePanel.add(li);
        contentPane.add(picturePanel);
        picturePanel.setBounds(new Rectangle(new Point(5, 0), li.getPreferredSize()));

        contentPane.setPreferredSize(li.getPreferredSizeForFrame());
        pack();

        //===== button1 =====
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1Pressed(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(contentPane.getWidth()-60, 65), button1.getPreferredSize()));

        //set needed size for this frame
    }

    private void button1Pressed(ActionEvent e) {
        System.out.println("click");
        button1pressed = true;
        picturePanel.repaint();
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
