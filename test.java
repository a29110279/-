import java.awt.Frame;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

public class test{
    public static void main(String[] args){
        Frame win = new Frame("Hello BOD!");
        win.setLocation(200, 300);
        win.setSize(500, 300);
        win.setVisible(true);
        win.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(1);
            }
        });

    }

    public static void showImage(){
        JFrame frame = new JFrame("place_test");
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("img/300.jfif"));
        panel.add(label);
        frame.add(panel);
        frame.setBounds(200, 300, 500, 300);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

