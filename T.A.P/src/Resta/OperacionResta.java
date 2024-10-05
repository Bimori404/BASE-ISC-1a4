package Resta;

import java.awt.event.*;
import javax.swing.*;

public class OperacionResta extends JFrame implements ActionListener {
    private JTextField num1, num2, res;
    private JLabel etiq1, etiq2;
    private JButton boton1;

    public OperacionResta(){
        setLayout(null);
        etiq1=new JLabel("Num 1");
        etiq1.setBounds(10,10,100,30);
        add(etiq1);
        num1=new JTextField();
        num1.setBounds(100,10,150,30);
        add(num1);
        ///////////////////////////////////
        etiq2=new JLabel("Num 2");
        etiq2.setBounds(10,40,100,30);
        add(etiq2);  //I.D U.D
        num2=new JTextField();
        num2.setBounds(100,42,150,30);
        add(num2);
        ///////////////////////////////////
        boton1=new JButton("=");
        boton1.setBounds(100,74,80,30);
        add(boton1);
        boton1.addActionListener(this);
        res=new JTextField();
        res.setBounds(185,74,65,30);
        add(res);
    }

    public void actionPerformed(ActionEvent e){
        double  val1,val2,resultado1;
        String resultado;
        if (e.getSource()==boton1) {
            if(num1.getText().equals("") || num2.getText().equals("")){
                
            }else{
                val1=Integer.parseInt(num1.getText());
                val2=Integer.parseInt(num2.getText());
                resultado1=val1-val2;
                resultado=String.valueOf(resultado1);
                res.setText(resultado);
            }               
        }
    }
    
    public static void main(String[] args) {
        OperacionResta objOperResta = new OperacionResta();
        objOperResta.setBounds(0,0,350,170);
        objOperResta.setVisible(true);
        objOperResta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}