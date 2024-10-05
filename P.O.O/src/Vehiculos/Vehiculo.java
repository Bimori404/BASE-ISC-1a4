package Vehiculos;
public class Vehiculo {
    String color; 
    String marca;
    double km;
    double velocidad;

    public Vehiculo() {
        color="";
        marca="";
        km=0;
        velocidad=0;
    }
    public Vehiculo(String color, String marca, double km, double velocidad) {
        setColor(color);
        setMarca(marca);
        setKm(km);
        setVelocidad(velocidad);
    }
    

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKm() {
        return km;
    }
    public void setKm(double km) {
        this.km = km;
    }

    public double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    
    public void Encender(){
        System.out.println("El vehiculo esta encendido");
    }
    public void Apagar(){
        System.out.println("El vehiculo esta apagado");
    }
    
    public void Print(){//Esto se usa para mandar los siguientes parametros y ahorrarnos codigo en la clase main
        System.out.println("Color: "+this.color);
        System.out.println("Marca: "+this.marca);
        System.out.println("Kilometraje: "+this.km);
        System.out.println("Velocidad: "+this.velocidad);
    }
}
