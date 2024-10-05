package Programa05;

import javax.swing.*;
import javax.swing.event.*;

public class Prog05 extends JFrame implements ChangeListener {
    private JCheckBox check, check1, check2;
    public Prog05(){
        setLayout(null);
        check=new JCheckBox("Gato");
        check.setBounds(10, 10, 150, 30);
        check.addChangeListener(this);
        add(check);
        check1=new JCheckBox("Perro");
        check1.setBounds(10, 50, 150, 30);
        check1.addChangeListener(this);
        add(check1);
        check2=new JCheckBox("Pez");
        check2.setBounds(10, 90, 150, 30);
        check2.addChangeListener(this);
        add(check2);
    }
    
    public void stateChanged(ChangeEvent e){
        String cad="";
        if (check.isSelected()==true) {
            cad=cad+"Tienes un gato :3";
        }
        if (check1.isSelected()==true) {
            cad=cad+"Eres un perruno :v";
        }
        if (check2.isSelected()==true) {
            cad=cad+"Tas mojado :c";
        }
        setTitle(cad);
    }
    
    public static void main(String[] arg){
        Prog05 objProg05 = new Prog05();
        objProg05.setBounds(0, 0, 350, 230);
        objProg05.setVisible(true);
        objProg05.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}


