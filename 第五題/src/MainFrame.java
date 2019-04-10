import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JLabel jb0 = new JLabel("成績");
    private JLabel jlb = new JLabel(" ");
    private TextField tf = new TextField();
    private JButton jb1 = new JButton("評定");
    private JButton jb2 = new JButton("Exit");
    private Container cp;



    public  MainFrame(){
        init();
    }
    private void init(){
        cp=this.getContentPane();
        cp.setLayout(null);
        this.setSize(600,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tf.setBounds(180,40,80,25);
        jb0.setBounds(120,40,80,25);
        jlb.setBounds(300,40,80,25);
        jb1.setBounds(100,70,80,25);
        jb2.setBounds(200,70,80,25);


        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (90 <= Integer.parseInt(tf.getText()) && 100 >= Integer.parseInt(tf.getText())) {
                    jlb.setText("A");
                } else {
                    if (80 <= Integer.parseInt(tf.getText()) && 90 >= Integer.parseInt(tf.getText())) {
                        jlb.setText("B");
                    } else {
                        if (70 <= Integer.parseInt(tf.getText()) && 80 >= Integer.parseInt(tf.getText())) {
                            jlb.setText("C");
                        } else {
                            if (60 <= Integer.parseInt(tf.getText()) && 70 >= Integer.parseInt(tf.getText())) {
                                jlb.setText("D");
                            } else {
                                if (60 > Integer.parseInt(tf.getText())) {
                                    jlb.setText("E");
                                }

                            }
                        }
                    }
                }
            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.exit(0);
            }
        });

        cp.add(tf);
        cp.add(jb0);
        cp.add(jlb);
        cp.add(jb1);
        cp.add(jb2);
    }
}
