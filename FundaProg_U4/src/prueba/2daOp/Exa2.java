//matriz forma caracol
import java.util.Scanner;
public class Exa2 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Dimesión De La Matriz: ");
        int n=leer.nextInt();
        mostrarMatriz(MatrizCaracol(n, 1), n, n);
    }
    public static int[][] MatrizCaracol(int n, int x) {
        int[][] Mat = new int[n+1][n+1];
        for(int a=1;a<=n/2;a++) {
            for(int i=a; i<=n-a; i++) {
                Mat[a][i]=x;
                x++;
            }
            for (int i=a; i<=n-a; i++) {
                Mat[i][n-a+1]=x;
                x++;
            }
            for (int i=n-a+1; i>=a+1; i--) {
                Mat[n-a+1][i]= x;
                x++;
            }
            for (int i=n-a+1; i>=a+1; i--) {
                Mat[i][a]=x;
                x++;
            }
        }
        if (n%2==1) {
            Mat[n/2+1][n/2+1]=x;
        }
        return Mat;
    }
    public static void mostrarMatriz(int[][] M, int f, int c) {
        for (int i=1; i<=f; i++) {
            for (int j=1; j<=c; j++) {
                System.out.print(M[i][j]);
            }
            System.out.println();
        }
    }
}