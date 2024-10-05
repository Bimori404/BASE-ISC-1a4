package Programa02;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener; //Se usa para detectar y manejar eventos de acción sobre un elemento del programa.
import javax.swing.JButton;

public class Prog02 extends JFrame implements ActionListener {
    private JButton boton1; //Declaramos una variable para el boton
        public Prog02(){ //Creamos el costructor
        setLayout(null);
        boton1=new JButton("Finalizar"); //Creamos y nombramos el boton
        boton1.setBounds(300, 250, 100, 30); //le damos dimenciones y coerdenadas
        add(boton1); //Agregamos la variable para que se muestre en pantalla
        boton1.addActionListener(this); //Esto es para que el boton tenga interaccion con el usuario
    }

    public void actionPerformed( ActionEvent e){ //Creamos un metodo
        if(e.getSource()==boton1){ //Si obtenemos la accion que queremos entonces la realizamos
            System.exit(0);
        }
    }
    
    public static void main(String [] args){ //Creamos el main
        Prog02 objProg02= new Prog02(); //Declaramos un objeto de la clase
        objProg02.setBounds(0, 0, 450, 350); //Estas son las dimenciones de la ventana
        objProg02.setVisible(true); //Esto es para que la ventana sea visible
        objProg02.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Esto es la accion de lo que el boton [ X ] realiza
    }
}
