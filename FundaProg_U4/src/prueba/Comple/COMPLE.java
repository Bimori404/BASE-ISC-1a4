
import java.util.Scanner;
public class COMPLE {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int b=0;
        System.out.println("Ingresa longitud");
        int n=leer.nextInt();
        System.out.println("ingresa correspondientes letras");
        String v=leer.next();
         String mat[][]=new String[n][n];
         for(int i=0; i<n; i++){
             for(int j=0; j<n; j++){      
                 mat[i][j]=leer.next();
                 if(mat[i][j].equals("a")){
                  b=1;
                 }
                 if(mat[i][j].equals("e")){
                   b=1;
                 }
                 if(mat[i][j].equals("i")){
                   b=1;
                 }
                 if(mat[i][j].equals("o")){
                   b=1;
                 }
                 if(mat[i][j].equals("u")){
                   b=1;
                 }
                 if(b!=1){
                   j--;
                 }
               }                
             }
        
        for(int i=0; i<n; i++){
             for(int j=0; j<n; j++){
                 System.out.print(mat[i][j] + " ");   
             }
              System.out.println( );
          }
     }
}


