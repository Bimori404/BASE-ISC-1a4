package Cambiarimagen;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cambiarimagen extends JFrame implements ActionListener {

    CardLayout card;
    JButton b1, b2;
    Container c;

    Cambiarimagen() {
        c = getContentPane();
        card = new CardLayout(0, 0); 
        c.setLayout(card);

        b1 = new JButton("EwE");
        b2 = new JButton("UwU");
        
        ImageIcon ewe = new ImageIcon("resources/fondo1.jpg");
        b1.setIcon(ewe);       
        b1.addActionListener(this);
        
        ImageIcon uwu = new ImageIcon("resources/fondo1.jpg");
        b2.setIcon(uwu);
        b2.addActionListener(this);

        c.add("a", b1);
        c.add("b", b2);

    }

    public void actionPerformed(ActionEvent e) {
        card.next(c);
    }

    public static void main(String[] args) {
        Cambiarimagen cl = new Cambiarimagen();
        cl.setSize(490, 360);
        cl.setVisible(true);
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
