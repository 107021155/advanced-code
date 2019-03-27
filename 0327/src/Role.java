import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Role extends JLabel{
    private Random rand = new Random(System.currentTimeMillis());
    ImageIcon icon = new ImageIcon("images.jpg");
    private int x, y;
    private Timer t1;

       Role() {
           this.setIcon(icon);
           x = rand.nextInt(1280);
           y = rand.nextInt(720);
           this.setBounds(x, y, icon.getIconWidth(), icon.getIconHeight());
           t1 = new Timer(100, new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   x=x+5;
                   Role.this.setLocation(x,y);
               }
           });
       t1.start();
    }
}
