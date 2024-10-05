package PapeleriaLaExcepcion;

import java.util.Scanner;

public class Trabajador extends InfoGen {
    
    String mes;
    double salario;
    int horasT, dia;

    public Trabajador(double salario, int horasT, String name,String ape, int id, String mes, int dia) {
        super(name, ape, id);
        setSalario(salario);
        setHorasT(horasT);
        setMes(mes);
        setDia(dia);
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHorasT() {
        return horasT;
    }
    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }

    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    
    
}
