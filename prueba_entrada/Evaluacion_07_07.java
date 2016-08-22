package prueba_entrada;

import java.util.Scanner;

public class Evaluacion_07_07 {
    
    public static void main(String[] args) {
        int cantHeridos[][] = new int[4][3];
        int graves=0;
        int medios=0;
        int leves=0;
        int km = 0;
        ingresar(cantHeridos, graves, medios, leves, km);
        System.out.println("La cantidad total de heridos es: " + cantTotal(graves, medios, leves));
        System.out.println("La cantidad de heridos segun gravedad: \n-graves: "+graves+"\n-medios: "+medios+"\n-leves: "+leves);
    }
    
    public static void ingresar(int H[][], int graves, int medios, int leves, int km) {
        Scanner intro = new Scanner(System.in);
        int op;
        do {
            System.out.println("Ingrese tipo de herido\n1 = grave\n2 = medio\n3 = leve\n5 = salir");
            op = intro.nextInt();
            if (op == 1) {
                for (int i = 0; i < H.length; i++) {
                    for (int j = 0; j < H.length; j++) {
                        do {
                            System.out.println("Ingrese cantidad de heridos graves");
                            H[1][j] = intro.nextInt();
                            if (H[1][j] < 0) {
                                System.out.println("***Ingreso incorrecto***");
                            }
                            graves = graves + H[1][j];
                        } while (H[1][j] < 0);                        
                    }
                }
                
            }
            if (op == 2) {
                for (int i = 0; i < H.length; i++) {
                    for (int j = 0; j < H.length; j++) {
                        do {
                            System.out.println("Ingrese cantidad de heridos medios");
                            H[2][j] = intro.nextInt();
                            if (H[2][j] < 0) {
                                System.out.println("***ingreso incorrecto***");
                            }
                            medios = medios + H[2][j];
                        } while (H[2][j] < 0);
                    }
                }
                
            }
            if (op == 3) {
                for (int i = 0; i < H.length; i++) {
                    for (int j = 0; j < H.length; j++) {
                        do {
                            System.out.println("Ingrese cantidad de heridos leve");
                            H[3][j] = intro.nextInt();
                            if (H[3][j] < 0) {
                                System.out.println("***Ingreso incorrecto***");
                            }
                            leves = leves + H[3][j];
                        } while (H[3][j] < 0);
                    }
                }
                
            }
            if (op == 4){
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        do{
                            System.out.println("Ingrese los KM de su ubicacion");
                            H[4][j] = intro.nextInt();
                            if (H[4][j] < 0){
                                System.out.println("***Ingreso incorrecto***");
                            }
                            km = km + H[4][j];
                        }while (H[4][j] < 0);
                    }
                }
                
            }
        } while (op == 5);
        
    }
    
    public static int cantTotal(int graves, int medios, int leves) {
        int resultado=0;
        resultado = graves+medios+leves;
        return resultado;
    }
}
