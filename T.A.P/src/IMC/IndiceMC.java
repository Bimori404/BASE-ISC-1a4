package IMC;

import java.awt.*;
import javax.swing.*;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndiceMC extends JFrame implements ActionListener {

    JLabel lienzo; //Este lo conviertes a un JLabel. Originalmente lo tenias como un JPanel y eso no jala
    JFrame ventana;
    JLabel estatura, peso, m, kg, resultado, img;
    JTextField estaturaT, pesoT;
    JButton calcular;

    public IndiceMC() {
        ventana = new JFrame("IMC Mi");
        ventana.setSize(350, 420);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
        lienzo = new JLabel(); //Le cambias aqui tambien
        lienzo.setSize(ventana.getWidth(), ventana.getHeight());
        lienzo.setLocation(0, 0);
        lienzo.setLayout(null);
        lienzo.setVisible(true);
        lienzo.setIcon(new ImageIcon("resources/fondo2.png")); // Le agregas esta linea donde especificas la ruta de la imagen
        
        
        estatura = new JLabel("Estatura: ");
        estatura.setBounds(15, 160, 200, 100);
        estatura.setVisible(true);
        lienzo.add(estatura);
        m = new JLabel("m");
        m.setBounds(270, 160, 200, 100);
        m.setVisible(true);
        lienzo.add(m);

        peso = new JLabel("Peso: ");
        peso.setBounds(15, 210, 200, 100);
        peso.setVisible(true);
        lienzo.add(peso);
        kg = new JLabel("kg ");
        kg.setBounds(270, 210, 200, 100);
        kg.setVisible(true);
        lienzo.add(kg);

        estaturaT = new JTextField();
        estaturaT.setBounds(70, 200, 190, 30);
        lienzo.add(estaturaT);

        pesoT = new JTextField();
        pesoT.setBounds(70, 250, 190, 30);
        lienzo.add(pesoT);
        calcular = new JButton("Calcular");
        calcular.setBounds(110, 300, 120, 30);
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
        DecimalFormat objFormato = new DecimalFormat("#.##");

        if (a.getSource() == calcular) {
            if (IMC < 18.5) {
                JOptionPane.showMessageDialog(this, "Su IMC es de:   " + objFormato.format(IMC) + "  \nDEBAJO DEL NORMAL", "Total IMC", JOptionPane.INFORMATION_MESSAGE);
            } else if (IMC >= 18.5 && IMC <= 24.9) {
                JOptionPane.showMessageDialog(this, "Su IMC es de:   " + objFormato.format(IMC) + "  \nNORMAL", "Total IMC", JOptionPane.INFORMATION_MESSAGE);
            } else if (IMC >= 25.0 && IMC <= 30) {
                JOptionPane.showMessageDialog(this, "Su IMC es de:   " + objFormato.format(IMC) + "  \nSOBRE PESO", "Total IMC", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Su IMC es de:   " + objFormato.format(IMC) + "  \nOBESIDAD", "Total IMC", JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }

    public static void main(String[] args) {
        IndiceMC obj = new IndiceMC();
    }

}