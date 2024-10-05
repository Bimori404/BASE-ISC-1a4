package ImageBotton;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    private JPanel panel;
    private JButton boton;
    
    public Ventana(){
        setBounds(50, 50, 300, 300);
        setTitle("Evento");
        iniComp();
    }
    
    private void iniComp(){
        colocarPanel(); 
        colocarBoton();
    }
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    private void colocarBoton(){
        boton = new JButton();
        boton.setBounds(100, 200, 100, 40);
        ImageIcon click = new ImageIcon("x.png");
        boton.setIcon(new ImageIcon(click.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(boton);
        
        boton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
    public static void main(String [] args){
        Ventana objVentana= new Ventana();
        objVentana.setVisible(true);
        objVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}
