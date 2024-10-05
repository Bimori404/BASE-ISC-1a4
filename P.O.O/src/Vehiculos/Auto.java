package Vehiculos;

public class Auto extends Vehiculo {
    int año;
    int cilindros;
    String modelo;

    public Auto() {
        super();
        año = 0;
        cilindros = 0;
        modelo = "";
    }
    public Auto(int año, int cilindros, String modelo, String color, String marca, double km, double velocidad) {
        super(color, marca, km, velocidad);
        this.año = año;
        this.cilindros = cilindros;
        this.modelo = modelo;
    }
    
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }

    public int getCilindros() {
        return cilindros;
    }
    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void Encender(){
        System.out.println("El auto esta encendido");
        System.out.println("Tiene un km de "+this.km);
    }
    public void Arrancar(){
        System.out.println("Mas despacio velocista!");
    }
    
    @Override
    public void Print(){//Esto se usa para mandar los siguientes parametros y ahorrarnos codigo en la clase main
        System.out.println("Color: "+this.color);
        System.out.println("Marca: "+this.marca);
        System.out.println("Kilometraje: "+this.km);
        System.out.println("Velocidad: "+this.velocidad);
        System.out.println("Año: "+this.año);
        System.out.println("Cilindros: "+this.cilindros);
        System.out.println("Modelo: "+this.modelo);
    }
}
