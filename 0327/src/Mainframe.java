import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Mainframe extends JFrame {
        private JButton jbadd = new JButton("Add");
        private JButton jbexit = new JButton("EXIT");
        private JButton jbu = new JButton("U");
        private JButton jbd = new JButton("D");
        private JButton jbl = new JButton("L");
        private JButton jbr = new JButton("R");
        private JButton jbc = new JButton("CLONE");
        private Container cp;
        private int count = 0;
        private JLabel jlb = new JLabel();
        private ImageIcon Icn = new ImageIcon("images.jpg");
        ArrayList<Role>asList=new ArrayList<>();

        public  Mainframe(){
            init();
        }
        private void init(){
            cp=this.getContentPane();
            cp.setLayout(null);
            this.setSize(600,500);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            jlb.setIcon(Icn);
            jlb.setBounds(90,50,Icn.getIconWidth(),Icn.getIconHeight());
            jbadd.setBounds(0,0,80,25);
            jbexit.setBounds(90,0,80,25);
            jbu.setBounds(180,0,80,25);
            jbd.setBounds(270,0,80,25);
            jbl.setBounds(360,0,80,25);
            jbr.setBounds(450,0,80,25);
            jbc.setBounds(540,0,80,25);


            jbadd.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    count++;
                    Mainframe.this.setTitle(Integer.toString(count));
                }
            });
            jbexit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    count++;
                    Mainframe.this.setTitle(Integer.toString(count));
                }
            });
            jbu.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (jlb.getY()-5>25){
                        jlb.setLocation(jlb.getX(),jlb.getY()-5);
                    }
                }
            });
            jbd.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (jlb.getY()+5<500){
                        jlb.setLocation(jlb.getX(),jlb.getY()+5);
                    }
                }
            });
            jbl.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (jlb.getX()-5>0){
                        jlb.setLocation(jlb.getX()-5,jlb.getY());
                    }
                }
            });
            jbr.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (jlb.getX()+5<600){
                        jlb.setLocation(jlb.getX()+5,jlb.getY());
                    }
                }
            });
            jbc.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    asList.add(new Role());
                    cp.add(asList.get(asList.size()-1));
                    cp.repaint();
                }
            });


            cp.add(jbadd);
            cp.add(jbexit);
            cp.add(jlb);
            cp.add(jbu);
            cp.add(jbd);
            cp.add(jbl);
            cp.add(jbr);
            cp.add(jbc);
        }
}
