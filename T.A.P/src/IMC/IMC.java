package IMC;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class IMC extends JFrame implements ActionListener {
    JFrame ventana;
    JLabel estatura, peso, lienzo;
    JTextField estaturaT, pesoT;
    JButton calcular;
    
    public IMC(){
        //ventana
        ventana = new JFrame("IMC");
        ventana.setSize(250, 190);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        //Lienzo de la ventana
        lienzo = new JLabel();
        lienzo.setSize(ventana.getWidth(), ventana.getHeight());
        lienzo.setLocation(0, -15);
        lienzo.setIcon(new ImageIcon("resources/fondo2.jpg")); // la carpeta resources debe estar en donde esta el src
        lienzo.setLayout(null);
        lienzo.setVisible(true);
         //Etiquetas
        estatura = new JLabel("Estatura: ");
        estatura.setBounds(5, -15, 100, 100);
        estatura.setVisible(true);
        lienzo.add(estatura);
        
        estatura = new JLabel("Mts");
        estatura.setForeground(Color.WHITE);
        estatura.setBounds(175, -15, 200, 100);
        estatura.setVisible(true);
        lienzo.add(estatura);
        
        peso = new JLabel("Peso: ");
        peso.setBounds(5, 30, 200, 100);
        peso.setVisible(true);
        lienzo.add(peso);
        
        peso = new JLabel("Kg");
        peso.setForeground(Color.WHITE);
        peso.setBounds(175, 30, 200, 100);
        peso.setVisible(true);
        lienzo.add(peso);
        //Texto
        estaturaT=new JTextField();
        estaturaT.setBounds(60,24,110,30);
        lienzo.add(estaturaT);
        
        pesoT=new JTextField();
        pesoT.setBounds(60,68,110,30);
        lienzo.add(pesoT);
        
        //Boton
        calcular=new JButton("Calcular IMC");
        calcular.setBounds(59,105,110,30);
        lienzo.add(calcular);
        calcular.addActionListener(this);
        
        ventana.add(lienzo);
        ventana.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent a) {
        String e = estaturaT.getText();
        String p = pesoT.getText();
        Double est = Double.parseDouble(e);
        Double peso = Double.parseDouble(p);
        double IMC = peso / (est * est);
        
        if(a.getSource()==calcular){
            if (IMC < 18.5) {
                JOptionPane.showMessageDialog(null, "Tu peso es inferior al normal");
                estaturaT.setText("");
                pesoT.setText("");
            } else if (IMC >= 18.5 && IMC <= 24.9) {
                JOptionPane.showMessageDialog(null, "Tu peso es normal");
                estaturaT.setText("");
                pesoT.setText("");
            } else if (IMC >= 25.0 && IMC <= 30) {
                JOptionPane.showMessageDialog(null, "Tu peso es superior al normal");
                estaturaT.setText("");
                pesoT.setText("");
            } else if (IMC >= 30){
                JOptionPane.showMessageDialog(null, "Tienes obesidad");
                estaturaT.setText("");
                pesoT.setText("");
            }
        }
    }
    
    public static void main(String[] args) {
        IMC obj = new IMC();
    }
}
