import java.awt.Frame;
import java.awt.event.*;

public class test{
    public static void main(String[] args){
        Frame win = new Frame("Hello Mother Fucker!");
        win.setLocation(200, 300);
        win.setSize(500, 300);
        win.setVisible(true);
        win.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(1);
            }
        });

    }
<<<<<<< HEAD
}
>>>>>>> 7c416fe87621e98a524cd895a567161e22bf9900
=======
}
>>>>>>> 3c4305e69d06ecdb42140c89b3c14d85ba010720
