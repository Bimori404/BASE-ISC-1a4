import java.util.Scanner;
public class Programa2 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int n=0;
        String arrDato[] = new String[n];
        String nombre;
                System.out.println("Cuantos nombres quieres ingresar");
                n=leer.nextInt();
                System.out.println("ingresa los nombres");
                for(int i=0; n>=i; i++){
                nombre=leer.next();
                arrDato[n]=nombre;
            }   
            for(int i=0; n>=i; i++){
                System.out.println(arrDato[n]);
            }   
        }
}
