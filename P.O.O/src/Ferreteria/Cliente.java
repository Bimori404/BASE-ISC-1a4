package Ferreteria;

import FlujoArchivosFerreteria.Info;

public class Cliente extends Info {
    
    int numCliente, puntos;

    public Cliente() {
        numCliente = 0;
        puntos = 0;
    }
    public Cliente(int numCliente, int puntos, String nombre, String tipo) {
        super(nombre, tipo);
        setNumCliente(numCliente);
        setPuntos(puntos);
    }

    public int getNumCliente() {
        return numCliente;
    }
    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
}
