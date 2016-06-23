
package ejercicios;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        double matriz[][]=new double [3][3];
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Ingresar notas del alumno "+(i+1));
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingresar nota de evaluación "+(j+1));
                matriz [i][j] = Double.parseDouble(intro.nextLine());
                
            }
            
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" \t");
            }
            System.out.println(" ");
        }
        
    }
}
