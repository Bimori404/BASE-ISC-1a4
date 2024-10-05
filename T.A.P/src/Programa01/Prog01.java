
package Programa01;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Prog01 extends JFrame {
    private JLabel name; //Declaramos una variable para la etiqueta
    
    public Prog01(){ //Creamos el constructor
        setLayout(null);
        name = new JLabel("Hola"); //Creamos la etiqueta
        name.setBounds(10, 20, 200, 300); //Le damos cordenadas en plano cartesiano
        add(name); //Agregamos la variable para que se muestre en pantalla
    }
    
    public static void main(String [] args){  //Creamos el main
        Prog01 objProg01 = new Prog01(); //Declaramos un objeto de la clase
        objProg01.setBounds(10, 10, 400, 300); //Estas son las dimenciones de la ventana
        objProg01.setVisible(true); //Esto es para que la ventana sea visible
        objProg01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Esto es la accion de lo que el boton [ X ] realiza
    }
}
