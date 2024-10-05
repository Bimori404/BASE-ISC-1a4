package proyectofecha;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SignoZodiacal {
    int dia, mes;

    public SignoZodiacal(int dia, int mes) {
        setDia(dia);
        setMes(mes);
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public String SignoZodiacalMes() throws ExceptionDiaDelMes  {
        String signo="";
        switch(mes){
            case 1:
                if(dia < 1 || dia > 31){
                        throw new ExceptionDiaDelMes("El dia es erroneo");
                }
            break;
            case 2:
                if(dia < 1 || dia > 31){
                        throw new ExceptionDiaDelMes("El dia es erroneo");
                }
            break;
            case 3:
                if(dia < 1 || dia > 31){
                        throw new ExceptionDiaDelMes("El dia es erroneo");
                }
            break;
            case 4:
                if(dia < 1 || dia > 31){
                        throw new ExceptionDiaDelMes("El dia es erroneo");
                }
            break;
            case 5:
                if(dia < 1 || dia > 31){
                        throw new ExceptionDiaDelMes("El dia es erroneo");
                }
            break;
            case 6:
                if(dia < 1 || dia > 31){
                        throw new ExceptionDiaDelMes("El dia es erroneo");
                }
            break;
            case 7:
                if(dia < 1 || dia > 31){
                        throw new ExceptionDiaDelMes("El dia es erroneo");
                }
            break;
            case 8:
                if(dia < 1 || dia > 31){
                        throw new ExceptionDiaDelMes("El dia es erroneo");
                }
            break;
            case 9:
                if(dia < 1 || dia > 31){
                        throw new ExceptionDiaDelMes("El dia es erroneo");
                }
            break;
            case 10:
                if(dia < 1 || dia > 31){
                        throw new ExceptionDiaDelMes("El dia es erroneo");
                }
            break;
            case 11:
                if(dia < 1 || dia > 31){
                        throw new ExceptionDiaDelMes("El dia es erroneo");
                }
            break;
            case 12:
                if(dia < 1 || dia > 31){
                        throw new ExceptionDiaDelMes("El dia es erroneo");
                }
            break;
        }
        return null;
    }
    
}
