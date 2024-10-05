
package test;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Operaciones {
    public static void main (String[]args){
        try{
    int op, v2, v1;
    double va1, va2;
    Scanner objLeer= new Scanner (System.in);
    System.out.println ("Opraciones basicas");
    System.out.println("Ingresa la operacion solicitante\n 1.-Suma\n 2.-Resta\n 3.-Divicion\n 4.-Multiplicacion");
    op=objLeer.nextInt();
    switch(op){
        case 1:
            Suma objSuma = new Suma();
            System.out.println("Ingresa el primer valor: ");
            v1 = objLeer.nextInt();
            System.out.println("Ingresa el segundo valor: ");
            v2 = objLeer.nextInt();
            objSuma= new Suma(v1,v2);//Crear
            System.out.println("El resultado es: "+objSuma.sum());    
        break;
            
        case 2:
            Resta objResta = new Resta();
            System.out.println("Ingresa el primer valor: ");
            v1 = objLeer.nextInt();
            System.out.println("Ingresa el segundo valor: ");
            v2 = objLeer.nextInt();
            objResta= new Resta(v1,v2);//Crear
            System.out.println("El resultado es: "+objResta.res());
        break;
            
        case 3:
            Divicion objDivicion = new Divicion();
            System.out.println("Ingresa el primer valor: ");
            va1 = objLeer.nextDouble();
            System.out.println("Ingresa el segundo valor: ");
            va2 = objLeer.nextDouble();
            objDivicion= new Divicion(va1,va2);//Crear
            System.out.println("El resultado es: "+objDivicion.div());
        break;
            
        case 4:
            Multiplicacion objMultiplicacion = new Multiplicacion();
            System.out.println("Ingresa el primer valor: ");
            v1 = objLeer.nextInt();
            System.out.println("Ingresa el segundo valor: ");
            v2 = objLeer.nextInt();
            objMultiplicacion= new Multiplicacion(v1,v2);//Crear
            System.out.println("El resultado es: "+objMultiplicacion.mult());
        break;
    }
            }catch(NoClassDefFoundError e){
                System.out.println(e.getMessage());
                }catch(OutOfMemoryError e){
                    System.out.println(e.getMessage());
            }catch(VirtualMachineError e){
                System.out.println(e.getMessage());   
        }catch(Error e){
            System.out.println(e.getMessage());
          
                }catch(NegativeArraySizeException e){
                    System.out.println(e.getMessage());
                }catch(NoSuchElementException e){
                    System.out.println(e.getMessage());
                }catch(NullPointerException e){
                    System.out.println(e.getMessage());
                }catch(SecurityException e){
                    System.out.println(e.getMessage());
                    }catch(StringIndexOutOfBoundsException e){//2
                        System.out.println(e.getMessage());
                    }catch(ArrayIndexOutOfBoundsException e){//2
                        System.out.println(e.getMessage());
                }catch(IndexOutOfBoundsException e){
                    System.out.println(e.getMessage());
                }catch(IllegalMonitorStateException e){//4
                    System.out.println(e.getMessage());
                    }catch(IllegalThreadStateException e){
                        System.out.println(e.getMessage());
                    }catch(NumberFormatException e){
                        System.out.println(e.getMessage());
                }catch(IllegalArgumentException e){//4
                    System.out.println(e.getMessage());
                }catch(EmptyStackException e){
                    System.out.println(e.getMessage());
                }catch(ClassCastException e){//3
                    System.out.println(e.getMessage());
                }catch(ArrayStoreException e){
                    System.out.println(e.getMessage());
                }catch(ArithmeticException e){//1
                    System.out.println(e.getMessage());
            }catch(RuntimeException e){
                System.out.println(e.getMessage());
            
        }catch(Exception e){
            System.out.println(e.getMessage());
    }catch (Throwable e) {
        System.out.println(e.getMessage());
    }
    
        /*
        catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException e) {
            System.out.println(e.getMessage());
        } catch (InterrupedException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayStoreException e) {
            System.out.println(e.getMessage());
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        } catch (IllegalThreadStateException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (IllegalMonitorStateException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }catch(ConnectionNotFoundException e){
            System.out.println(e.getMessage());
         }catch(EOFException e){
            System.out.println(e.getMessage());
         }catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        */
    }
}
