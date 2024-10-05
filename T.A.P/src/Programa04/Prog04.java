package Programa04;

import javax.swing.event.*;
import javax.swing.*;
public class Prog04 extends JFrame implements ChangeListener {
    private JRadioButton ra1, ra2,ra3;
    private ButtonGroup bg;
    
    public Prog04(){
        setLayout(null);
        bg = new ButtonGroup();
        ra1=new JRadioButton("640*480");
        ra1.setBounds(10,20,100,30);
        ra1.addChangeListener(this);
        add(ra1);
        bg.add(ra1);
        
        ra2=new JRadioButton("800*600");
        ra2.setBounds(10,70,100,30);
        ra2.addChangeListener(this);        
        add(ra2);
        bg.add(ra2);
        
        ra3=new JRadioButton("1024*720");
        ra3.setBounds(10,120,100,30);
        ra3.addChangeListener(this);        
        add(ra3);
        bg.add(ra3);
    }
    
    public void stateChanged(ChangeEvent e) {
        if (ra1.isSelected()) {
                setSize(300,300);
        }
        if (ra2.isSelected()) {
                setSize(800,600);
        }
        if (ra3.isSelected()) {
                setSize(1024,720);
        }
    }
    
    public static void main(String[] ar) {
        Prog04 objProg04 = new Prog04();
        objProg04.setBounds(0,0,350,230);
        objProg04.setVisible(true);
        objProg04.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
