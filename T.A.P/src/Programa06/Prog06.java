package Programa06;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Prog06 extends JFrame implements ActionListener {
    private JMenuBar mb;
    private JMenu menu, menu1, menu2;
    private JMenuItem item, item1, item2, item3;
    
    public Prog06(){
        setLayout(null);
        mb =new JMenuBar();
        setJMenuBar(mb);
        menu = new JMenu("Opciones");
        mb.add(menu);
        menu1 = new JMenu("Opciones");
        menu.add(menu1);
        menu2 = new JMenu("Opciones");
        menu.add(menu2);
        item=new JMenuItem("640*480");
        menu1.add(item);
        item.addActionListener(this);
        item2= new JMenuItem("1024*760");
    }
            
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==item) {
            setSize(640,480);
        }
        if (e.getSource()==item1) {
            setSize(1024,768);
        }
        if (e.getSource()==item2) {
            getContentPane().setBackground(new Color(255,0,0));
        }
        if (e.getSource()==item3) {
            getContentPane().setBackground(new Color(255,0,0));
        }
    }
    
    public static void main(String[] arg){
        Prog06 objProg06 = new Prog06();
        objProg06.setBounds(0, 0, 300, 200);
        objProg06.setVisible(true);
        objProg06.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
