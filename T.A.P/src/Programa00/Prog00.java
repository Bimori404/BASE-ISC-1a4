package Programa00;

import javax.swing.JFrame; //es una clase utilizada en Swing para generar ventanas sobre las cuales añadir
                          //distintos objetos con los que podrá interactuar o no el usuario.

public class Prog00 {
    public static void main(String[] args) {
        Prog00 objProg00 = new Prog00("1"); //Aqui inicializamos un objeto el cual contendra el nombre de nuestra ventana
    }
    
    public Prog00 (String nomVentana){ //Inicializamos una variable que contrendra el nombre de la ventana
        JFrame objVentana = new JFrame(nomVentana); //Inicializamos un objeto y llamamos la variable
        objVentana.setSize(600,300); //Estas so las dimenciones de la ventana
        objVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Esto es la accion de lo que el boton [ X ] realiza
        objVentana.setVisible(true); //Esto es para que la ventana sea visible
    }
}
