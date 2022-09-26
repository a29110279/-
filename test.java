import java.awt.Frame;
import java.awt.event.*;

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
}

