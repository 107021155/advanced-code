import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Mainframe extends JFrame {
        private JButton jbadd = new JButton("放大");
        private JButton jbsub = new JButton("縮小");
        private JButton jbu = new JButton("U");
        private JButton jbd = new JButton("D");
        private JButton jbl = new JButton("L");
        private JButton jbr = new JButton("R");
        private JButton jbexit = new JButton("Exit");
        private Container cp;
        private JLabel jlb = new JLabel();

        public  Mainframe(){
            init();
        }
        private void init(){
            cp=this.getContentPane();
            cp.setLayout(null);
            this.setSize(600,500);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            jlb.setBounds(90,50,25,25);
            jbadd.setBounds(0,0,80,25);
            jbsub.setBounds(90,0,80,25);
            jbu.setBounds(180,0,80,25);
            jbd.setBounds(270,0,80,25);
            jbl.setBounds(360,0,80,25);
            jbr.setBounds(450,0,80,25);
            jbexit.setBounds(540,0,80,25);
            jlb.setOpaque(true);
            jlb.setBackground(Color.blue);


            jbadd.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (jlb.getWidth()+10<600 && jlb.getHeight()+10<500){
                          jlb.setSize(jlb.getWidth()+10,jlb.getHeight()+10);
                    }
                }
            });
            jbsub.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (jlb.getWidth()-10>0 && jlb.getHeight()-10>0){
                        jlb.setSize(jlb.getWidth()-10,jlb.getHeight()-10);
                    }

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
            jbexit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });



            cp.add(jbadd);
            cp.add(jbsub);
            cp.add(jlb);
            cp.add(jbu);
            cp.add(jbd);
            cp.add(jbl);
            cp.add(jbr);
            cp.add(jbexit);
        }
}
