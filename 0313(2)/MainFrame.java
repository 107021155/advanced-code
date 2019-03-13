import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JButton jb = new JButton("TEST");
    private Container cp;
    public  MainFrame(){
        init();
    }
    private void init(){
        cp=this.getContentPane();
        this.setSize(600,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp.add(jb);
    }
}
