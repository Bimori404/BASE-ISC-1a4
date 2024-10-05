package Polimorfismo;
public class Main {
    public static void main(String []args){
        ClaseA objA=new ClaseA();
        ClaseB objB=new ClaseB();
        ClaseC objC=new ClaseC();
        //Referencia a la clase A
        ClaseA ref;
        //ref hace referencia al objeto de la clase A
        ref = objA;
        //Llamamps al metodo 1 de la clase A
        ref.m1();
        //Ahora ref hace referencia al objeto de la clase B
        ref = objB;
        //Llamamps al metodo 1 de la clase B
        ref.m1();
        //Ahora ref hace referencia al objeto de la clase C
        ref = objC;
        //Llamamps al metodo 1 de la clase C
        ref.m1();
    }
}

/*

*Crear 10 clases en donde cada clase tenga a su vez 3 clases derivadas
*Crear un main(utilizando switch y do while) en donde se puedan ejecutar todos los casos
*Debe de imprimir utilizando la referencia en lugar de utilizar directamente el objeto

*/