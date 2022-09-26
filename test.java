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
        showImage(win); //show圖片要再設定視窗前
        
        win.setLocation(200, 300);
        win.setSize(500, 300);
        win.setVisible(true);
        win.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(1);
            }
        });
        
    }
    
    //顯示背景圖片的副程式 還無法依視窗大小縮放
    public static void showImage(Frame win){
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("img/300.jfif"));
        win.add(label);
    }
     
}

