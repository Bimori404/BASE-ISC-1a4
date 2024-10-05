package Calculadora;
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner leer=new Scanner(System.in);
        
        String entrada="";
        int opDo=0;
        
        do{
          try{
            System.out.println("1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Divicion\n5.-Factorial");
            opDo=leer.nextInt();
            leer.nextLine();
            switch(opDo){
                case 1:
                    System.out.println("Ingresa la suma");
                    entrada = leer.next();
                    System.out.println(suma(entrada));
                break;
                case 2:
                    System.out.println("Ingresa la resta");
                    entrada = leer.next();
                    System.out.println(resta(entrada));
                break;
                case 3:
                    System.out.println("Ingresa la multiplicacion");
                    entrada = leer.next();
                    System.out.println(multiplicacion(entrada));
                break;
                case 4:
                    System.out.println("Ingresa la divicion");
                    entrada = leer.next();
                    System.out.println(divicion(entrada));
                break;
                case 5:
                    System.out.println("Ingresa el factorial");
                    entrada = leer.next();
                    System.out.println(factorial(entrada));
                break;
                    
            }
            }catch(ExceptionFormatoInvalido | ExeptionNumerosNoSoportados e){
                System.out.println(e.getMessage());
            } catch (ExceptionIncalculable e) {
                System.out.println(e.getMessage());
            } catch (ExceptionNumeroNegativo e) {
               System.out.println(e.getMessage());
            }catch(NumberFormatException e){
                System.out.println("Syntax ERROR");
            }
            
        }while(opDo != 5);
    }

    static int suma(String entrada) throws ExceptionFormatoInvalido, ExeptionNumerosNoSoportados, NumberFormatException {
        String[] numeros = entrada.split( "\\s.\\s" );//Esto regresa posiciones de un arreglo
        if(numeros.length >  2)
            throw new ExeptionNumerosNoSoportados("Solo puedo realizar esta exprecion con 2 numeros");
        if(numeros.length <  2)
            throw new ExceptionFormatoInvalido("Formato invalido");
        
        
        int a = Integer.parseInt(numeros[0]), b = Integer.parseInt(numeros[1]);//Esto es para convertir strings a enteros
        return a+b;
        }
    
    static int resta(String entrada) throws ExceptionFormatoInvalido, ExeptionNumerosNoSoportados, NumberFormatException {
        String[] numeros = entrada.split( "\\s.\\s" );//Esto regresa posiciones de un arreglo
        if(numeros.length <  2)
            throw new ExceptionFormatoInvalido("Formato invalido");
        if(numeros.length >  2)
            throw new ExeptionNumerosNoSoportados("Solo puedo realizar esta exprecion con 2 numeros");
        
        int a = Integer.parseInt(numeros[0]), b = Integer.parseInt(numeros[1]);//Esto es para convertir strings a enteros
        return a-b;
        }
    static int multiplicacion(String entrada) throws ExceptionFormatoInvalido, ExeptionNumerosNoSoportados, NumberFormatException {
        String[] numeros = entrada.split( "\\s.\\s" );//Esto regresa posiciones de un arreglo
        if(numeros.length <  2)
            throw new ExceptionFormatoInvalido("Formato invalido");
        if(numeros.length >  2)
            throw new ExeptionNumerosNoSoportados("Solo puedo realizar esta exprecion con 2 numeros");
        
        int a = Integer.parseInt(numeros[0]), b = Integer.parseInt(numeros[1]);//Esto es para convertir strings a enteros
        return a*b;
        }
    //
    static int divicion(String entrada) throws ExceptionFormatoInvalido, ExeptionNumerosNoSoportados, NumberFormatException {
        String[] numeros = entrada.split( "\\s.\\s" );//Esto regresa posiciones de un arreglo
        int num=0, den=0;
        if((num>100) || (den<-5))
            throw new ExceptionFormatoInvalido("Numeros fuera de rango");
        if(numeros.length >  2)
            throw new ExeptionNumerosNoSoportados("Solo puedo realizar esta exprecion con 2 numeros");
        
        int a = Integer.parseInt(numeros[0]), b = Integer.parseInt(numeros[1]);//Esto es para convertir strings a enteros
        return a/b;
        }
    //
    static int factorial(String entrada) throws ExceptionFormatoInvalido, ExeptionNumerosNoSoportados, NumberFormatException, ExceptionIncalculable, ExceptionNumeroNegativo {
        boolean f = false;
        int a=0, res=1;
        if (entrada.charAt(entrada.length() - 1) == '!')
                f=true;
        else
                throw new ExceptionFormatoInvalido("Formato invalido");
        if (entrada.length() > 3)
            throw new ExceptionIncalculable("Formato incalculable");
        if(f){
            a = Integer.parseInt(entrada.substring(0, entrada.length() - 1));
            if(a<0)
                throw new ExceptionNumeroNegativo("No existen factoriales negativos");
            if(a>70)
                throw new ExceptionIncalculable("Formato incalculable");
            for(int i = 2; i <= a; i++){
                res *= i;
            }
          }
    return res;
        }
    
    }
    

