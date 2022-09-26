import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class test{

    private static ImageIcon image = new ImageIcon("basketball_court.png");
    public static void main(String[] args){
        JFrame Frame = new JFrame("Test");
        Frame.setIconImage(Frame.getToolkit().getImage("basketball_court.png"));
        Image BG = image.getImage();
        BG = BG.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        Frame.add(new JLabel(new ImageIcon("basketball_court.png")));
        Frame.setBounds(0, 0, 1366, 768);
        Frame.setSize(1366, 768);
        Frame.pack();
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setVisible(true);
    }
}