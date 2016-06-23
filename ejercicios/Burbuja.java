package ejercicios;

import java.util.Scanner;

public class Burbuja {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int arreglo[] = new int[5];
        int aux=0;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("ingresar numero");
            arreglo[i] = intro.nextInt();
        }
        
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;

                }

            }
        }
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+", ");
        }
            
        
    }

}
